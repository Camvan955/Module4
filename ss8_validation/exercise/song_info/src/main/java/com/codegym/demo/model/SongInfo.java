package com.codegym.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class SongInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Size(max = 800, message = "Tên bài hát không vượt quá 800 kí tự ")
    @Pattern(regexp = "^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$", message = "Tên không chứa kí tự đặc biệt")
    private String name;

    @NotEmpty
    @Size(max = 300, message = "Tên nghệ sĩ thực hiện không vượt quá 300 kí tự ")
    @Pattern(regexp = "^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$", message = "Tên không chứa kí tự đặc biệt")
    private String singer;

    @NotEmpty
    @Size(max = 1000, message = "Thể loại không vượt quá 300 kí tự ")
    @Pattern(regexp = "^([A-Z][a-z]+[ ])+([A-Z][a-z]+)$", message = "Thể loại không được chứa kí tự đặc biệt")
    private String category;

    public SongInfo() {
    }

    public SongInfo(int id, String name, String singer, String category) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
