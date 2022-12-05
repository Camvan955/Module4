package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FuramaController {
    @GetMapping("/index")
    public String showHome() {
        return "final_index";
    }
}
