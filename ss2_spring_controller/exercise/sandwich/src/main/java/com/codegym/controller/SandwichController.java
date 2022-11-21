package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class SandwichController {
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam("spice") String [] spice, Model model){
        model.addAttribute("spice",spice);
        return "choose";
    }
}
