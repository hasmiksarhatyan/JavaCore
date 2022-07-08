

package homework.books;

import homework.books.command.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Gender;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;


import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        Author juleVerne = new Author("Jule", "Verne", "nnnn@nnn", Gender.MALE);
        authorStorage.add(juleVerne);
        Author albertCamus = new Author("Albert", "Camus", "nnnn@nnn", Gender.MALE);
        authorStorage.add(albertCamus);
        Author murphy = new Author("Raymond", "Murfy", "nnnn@nnn", Gender.MALE);
        authorStorage.add(murphy);
        bookStorage.add(new Book("Twenty Thousand Leagues Under the Sea", juleVerne, 15, 1, "science fiction"));
        bookStorage.add(new Book("The Plague", albertCamus, 30, 1, "philosophical"));
        bookStorage.add(new Book("English Grammar", murphy, 40, 2, "study"));
        System.out.println("please enter login,password");
        if (login()) {
            boolean run = true;
            while (run) {
                Commands.printCommand();
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
    }

    private static boolean login() {
        String login = "admin";
        String password = "123456";
        if (login.equals(scanner.nextLine()) & password.equals(scanner.nextLine())) {
            return true;
        }
        System.out.println("wrong login or password!!!");
        System.out.println("please input correct login,password");
        return login();
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
                Book book = new Book(title, author, price, count, genre);
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
