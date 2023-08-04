package com.bttp.pojo;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private String status;
    private String quantity;
    private String year;

    public Book() {
    }

    public Book(String title, String author, String ISBN, String publisher, String status, String quantity, String year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.status = status;
        this.quantity = quantity;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
