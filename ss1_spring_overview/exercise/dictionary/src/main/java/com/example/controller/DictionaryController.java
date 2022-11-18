package com.example.controller;


import com.example.service.IDictionayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.Map;

@Controller
@RequestMapping("")
public class DictionaryController {
    @Autowired
    public IDictionayService iDictionayService;

    @GetMapping("")
    public String translate(){
        return "/home";
    }

    @PostMapping("")
    public String translate(@RequestParam String text, Model model){
        Map<String, String> map = iDictionayService.translate();
        model.addAttribute("map", map);
        model.addAttribute("text", text);

        return "/home";
    }

}
