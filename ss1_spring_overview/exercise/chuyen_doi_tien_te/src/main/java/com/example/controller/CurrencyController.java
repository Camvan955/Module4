package com.example.controller;


import com.example.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;


@Controller
@RequestMapping("")
public class CurrencyController {
    @Autowired
    private ICurrencyService iCurrencyService;

    @GetMapping("")
    public String showResult(){
        return "/index";
    }

    @PostMapping("/change")
    public String convert(@RequestParam int usd, Model model){
        int rs= iCurrencyService.convertVnd(usd);
        model.addAttribute("rs", rs);
        return "/index";

    }


}
