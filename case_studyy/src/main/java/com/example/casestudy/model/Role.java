package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
