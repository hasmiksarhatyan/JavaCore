package homework.books.storage;

import homework.books.model.Book;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = book;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }


    public void printBooksByGenre(String genre) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Genre not found");
        }
    }

    public void printBooksByPriceRange(double price1, double price2) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (price1 <= array[i].getPrice() && array[i].getPrice() <= price2 ||
                    price2 <= array[i].getPrice() && array[i].getPrice() <= price1) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No such price");
        }
    }
}
