package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String origin;
    private Double price;

    public Product() {
    }

    public Product(int id, String name, String origin, Double price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
