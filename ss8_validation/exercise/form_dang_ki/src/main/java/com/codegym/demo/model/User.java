package com.codegym.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Fist Name not null")
    @Size( min = 5, max = 45, message = " First Name có độ dài tối thiểu 5, tối đa 45 ký tự")
    @Pattern(regexp = "^([A-Z][a-z]+[ ]+)*([A-ZY][a-z]*)$", message = "First Name must be in correct format! ")
    private String firstName;

    @NotEmpty(message = "Last Name not null")
    @Size( min = 5, max = 45, message = " Last Name có độ dài tối thiểu 5, tối đa 45 ký tự")
    @Pattern(regexp = "^[A-Z][a-z]+$", message = "Last Name must be in correct format! ")
    private String lastName;

    @Pattern(regexp = "([0][1-9]{9})", message = "Phone number must be in correct format! ")
    private String phoneNumber;

    @Min(value = 18, message = "Age must be greater than or equal to 18")
    private String age;

    @Pattern(regexp = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$",message = "Email must be in correct format! ")
    private String email;

    public User() {
    }

    public User(int id, String firstName, String lastName, String phoneNumber, String age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
