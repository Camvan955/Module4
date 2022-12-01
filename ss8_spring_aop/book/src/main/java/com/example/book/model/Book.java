package com.example.book.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private int amount;

    @OneToMany(mappedBy = "book")
    private Set<Orders> order;

    public Book() {
    }

    public Book(int id, String name, String author, int amount, Set<Orders> order) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.amount = amount;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setIdBook(int idBook) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Set<Orders> getOrder() {
        return order;
    }

    public void setOrder(Set<Orders> order) {
        this.order = order;
    }
}
