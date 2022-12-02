package com.example.book.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long code;
    private boolean flag;

    @ManyToOne
    private Book book;

    public Orders() {
    }

    public Orders(Book book) {
        this.book = book;
    }

    //    public Orders(int id, Book book, Boolean flag) {
//        this.id = id;
//        this.book = book;
//        this.flag = flag;
//
//    }


    public Orders(int id, long code, boolean flag, Book book) {
        this.id = id;
        this.code = code;
        this.flag = flag;
        this.book = book;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
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




