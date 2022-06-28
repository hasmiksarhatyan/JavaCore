package homework.books;

import homework.students.Commands;

import java.util.Scanner;

public class BookDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("Twenty Thousand Leagues Under the Sea","Jule Verne",15,1,"science fiction"));
        bookStorage.add(new Book("The Plague","Albert Camus",30,1,"philosophical"));
        bookStorage.add(new Book("English Grammar","Murphy",40,2,"study"));
        boolean run = true;
        while (run) {
            System.out.println("please input " + Command.EXIT + " for exit");
            System.out.println("please input " + Command.ADD_BOOK + " for add book");
            System.out.println("please input " + Command.PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + Command.PRINT_BOOKS_BY_AUTHORE_NAME + " for print books by author name");
            System.out.println("please input " + Command.PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("please input " + Command.PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case Command.EXIT:
                    run = false;
                    break;
                case Command.ADD_BOOK:
                    addBooks();
                    break;
                case Command.PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case Command.PRINT_BOOKS_BY_AUTHORE_NAME:
                    printBooksByAuthorName();
                    break;
                case Command.PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case Command.PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("invalid command ");
            }
        }
    }

    private static void printBooksByPriceRange() {
        System.out.println("please enter price range ");
        System.out.print("price1 ");
        double price1 = Integer.parseInt(scanner.nextLine());
        System.out.print("price2 ");
        double price2 = Integer.parseInt(scanner.nextLine());
        bookStorage.printBooksByPriceRange(price1,price2);
    }

    private static void printBooksByGenre() {
        System.out.println("please enter genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByAuthorName() {
        System.out.println("please enter author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }

    private static void addBooks() {
        System.out.println("please input book's title");
        String title = scanner.nextLine();
        System.out.println("please input book's authorname");
        String authorname = scanner.nextLine();
        System.out.println("please input book's price");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("please input book's count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("please input book's genre");
        String genre = scanner.nextLine();
        Book book = new Book(title, authorname, price, count, genre);
        bookStorage.add(book);
        System.out.println("book created");
    }
}
