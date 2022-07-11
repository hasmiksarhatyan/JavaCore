package homework.books.model;

import homework.students.model.User;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int count;
    private String genre;
    private User registeredUser;

    public Book(String title, Author author, double price, int count, String genre, User registeredUser) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.count = count;
        this.genre = genre;
        this.registeredUser = registeredUser;
    }

    public Book() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getGenre() {
        return genre;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author.getName() + " " + author.getSurname() + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", registeredUser='" + registeredUser + '\'' +
                '}';
    }


}
