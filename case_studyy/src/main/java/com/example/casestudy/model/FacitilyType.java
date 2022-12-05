package com.example.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacitilyType {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public FacitilyType() {
    }

    public FacitilyType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
