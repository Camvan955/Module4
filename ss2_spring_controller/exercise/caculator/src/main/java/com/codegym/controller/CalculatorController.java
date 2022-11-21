package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/result")
    public String calculator(@RequestParam("number_one") double number_one,@RequestParam("number_two") double number_two,@RequestParam("calculus") String calculus, Model model) {
        double result = iCalculatorService.Calculator(number_one, number_two, calculus);
        model.addAttribute("result", result);
        model.addAttribute("number_one",number_one);
        model.addAttribute("number_two",number_two);

        return "index";
    }
}
