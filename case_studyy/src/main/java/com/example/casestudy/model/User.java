package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String usename;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_usename"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
        private Set<Role> roles;
}