package com.example.book.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean flag;

    @ManyToOne
    @JoinColumn(name = "id_book",referencedColumnName = "id")
    private Book book;

    public Orders() {
    }

//    public Orders(int id, Book book, Boolean flag) {
//        this.id = id;
//        this.book = book;
//        this.flag = flag;
//
//    }


    public Orders(int id, boolean flag, Book book) {
        this.id = id;
        this.flag = flag;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}




