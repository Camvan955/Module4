package com.codegym.demo.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String content;
    private String author;
    private String dayOfWrite;

    public Blog() {
    }

    public Blog(Long id, String name, String content, String author, String dayOfWrite) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.author = author;
        this.dayOfWrite = dayOfWrite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDayOfWrite() {
        return dayOfWrite;
    }

    public void setDayOfWrite(String dayOfWrite) {
        this.dayOfWrite = dayOfWrite;
    }
}
