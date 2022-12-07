package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FuramaController {
    @GetMapping("/furama")
    public String showHome() {
        return "index";
    }
}
