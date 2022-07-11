

package homework.books;

import homework.books.command.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Gender;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;
import homework.students.model.User;
import homework.students.model.UserType;


import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage=new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        initData();
        boolean run = true;
        while (run) {
            Commands.printLoginCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("invalid command ");
            }
        }

    }

    private static void initData() {
        User admin = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
        userStorage.add(admin);
        Author juleVerne = new Author("Jule", "Verne", "nnnn@nnn", Gender.MALE);
        authorStorage.add(juleVerne);
        Author albertCamus = new Author("Albert", "Camus", "nnnn@nnn", Gender.MALE);
        authorStorage.add(albertCamus);
        Author murphy = new Author("Raymond", "Murfy", "nnnn@nnn", Gender.MALE);
        authorStorage.add(murphy);
        bookStorage.add(new Book("Twenty Thousand Leagues Under the Sea", juleVerne, 15, 1, "science fiction",admin));
        bookStorage.add(new Book("The Plague", albertCamus, 30, 1, "philosophical",admin));
        bookStorage.add(new Book("English Grammar", murphy, 40, 2, "study",admin));
    }
    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exists!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");
            }
        }
    }
    private static void register() {
        System.out.println("please enter name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String userData[] = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!");
        }
        if (userStorage.getUserByEmail(userData[0]) == null) {
            User user = new User();
            user.setName(userData[0]);
            user.setSurname(userData[1]);
            user.setEmail(userData[2]);
            user.setPassword(userData[3]);
            user.setUserType(UserType.USER);
            userStorage.add(user);
            System.out.println("User created!");
        } else {
            System.out.println("User with " + userData[0] + " already exists!");
        }

    }

    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHORE_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("invalid command ");
            }
        }
    }
    private static void loginUser() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printUserCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHORE_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("invalid command ");
            }
        }
    }

    private static void addBooks() {

        if (authorStorage.getSize() != 0) {
            authorStorage.print();
            System.out.println("please choose author index");
            try {
                int authorIndex = Integer.parseInt(scanner.nextLine());
                Author author = authorStorage.getAuthorByIndex(authorIndex);
                System.out.println("please input book's title");
                String title = scanner.nextLine();
                System.out.println("please input book's price");
                double price;
                try {
                    price = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("wrong format of price!");
                    price = 0;
                }
                System.out.println("please input book's count");
                int count;
                try {
                    count = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("wrong format of count!");
                    count = 0;
                }
                System.out.println("please input book's genre");
                String genre = scanner.nextLine();
                Book book = new Book(title, author, price, count, genre,currentUser);
                bookStorage.add(book);
                System.out.println("book created");
            } catch (AuthorNotFoundException e) {
                System.out.println(e + " please choose correct index !");
                addBooks();
            } catch (NumberFormatException e) {
                System.out.println("wrong format of index, please input correct number!");
                addBooks();
            }
        }
    }


    private static void addAuthor() {
        System.out.println("please input author name");
        String name = scanner.nextLine();
        System.out.println("please input author surname");
        String surname = scanner.nextLine();
        System.out.println("please input author email");
        String email = scanner.nextLine();
        System.out.println("please input author gender, MALE or FEMALE");
        Gender gender;
        try {
            gender = Gender.valueOf(scanner.nextLine().toUpperCase());
            Author author = new Author(name, surname, email, gender);
            authorStorage.add(author);
            System.out.println("author created");

        } catch (IllegalArgumentException e) {
            System.out.println("please input correct gender");
            addAuthor();

        }
    }


    private static void printBooksByPriceRange() {
        System.out.println("please enter price range ");
        System.out.print("price1 ");
        double price1;
        try {
            price1 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            price1 = 0;
            System.out.println("wrong format of price!");
        }
        System.out.print("price2 ");
        double price2;
        try {
            price2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            price2 = 0;
            System.out.println("wrong format of price!");
        }
        bookStorage.printBooksByPriceRange(price1, price2);
    }

    private static void printBooksByGenre() {
        System.out.println("please enter genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByAuthorName() {
        System.out.println("please enter author name");
        String name = scanner.nextLine();
        authorStorage.printBooksByAuthorName(name);
    }


}
