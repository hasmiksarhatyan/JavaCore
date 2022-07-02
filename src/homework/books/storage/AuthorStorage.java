package homework.books.storage;

import homework.books.model.Author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;

    public Author getAuthorByIndex(int authorIndex) {
        if (authorIndex < 0 || authorIndex >= size) {
            return null;
        }
        return array[authorIndex];
    }
    public void printBooksByAuthorName(String name) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(name)) {
                System.out.println(array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Author name not found");
        }
    }


    public void add(Author author) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = author;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        Author[] temp = new Author[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

    public int getSize() {
        return size;
    }

}
