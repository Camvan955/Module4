package com.codegym.demo.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto {
    private int id;

    @NotEmpty(message = "{NotEmpty}")
    @Size( min = 5, max = 45, message = "{Length}")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "{Format}")
    private String firstName;

    @NotEmpty(message = "Last Name not null")
    @Size( min = 5, max = 45, message = "{Length}")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "{Format}")
    private String lastName;

    @Pattern(regexp = "([0][1-9]{9})", message = "{Format}")
    private String phoneNumber;

    @Min(value = 18, message = "Age must be greater than or equal to 18")
    private String age;

    @Pattern(regexp = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$",message = "{Format}")
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String phoneNumber, String age, String email) {
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


//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//

//    @Override
//    public void validate(Object target, Errors errors) {
//        // Cấu hình Validater
//        UserDto userDto = (UserDto) target;
//
//
//    }
}
