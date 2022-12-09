package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("furama")
public class FuramaController {
    @GetMapping("")
    public String showHome() {
        return "index";
    }
}
