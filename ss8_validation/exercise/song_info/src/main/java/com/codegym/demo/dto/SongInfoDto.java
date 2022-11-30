package com.codegym.demo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongInfoDto {

    private int id;

    @NotEmpty(message ="{NotEmpty}")
    @Size(max = 800, message = "Tên bài hát không vượt quá 800 kí tự ")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "{Format}")
    private String name;

    @NotEmpty(message ="{NotEmpty}")
    @Size(max = 300, message = "Tên nghệ sĩ thực hiện không vượt quá 300 kí tự ")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "{Format}")
    private String singer;

    @NotEmpty(message ="{NotEmpty}")
    @Size(max = 1000, message = "Thể loại không vượt quá 300 kí tự ")
    @Pattern(regexp = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$", message = "{Format}")
    private String category;

    public SongInfoDto() {
    }

    public SongInfoDto(int id, String name, String singer, String category) {
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
