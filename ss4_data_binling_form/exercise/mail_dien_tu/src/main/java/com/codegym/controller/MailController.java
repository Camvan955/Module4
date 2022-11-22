package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MailController {
    @Autowired
    IEmailService iEmailService;

    @GetMapping("")
    public String getForm(Model model){
        List<String> languageList = iEmailService.languageList();
        List<Integer> pageSizeList = iEmailService.pageSizeList();

        model.addAttribute("languages", languageList);
        model.addAttribute("pageSize", pageSizeList);
        model.addAttribute("email",new Email());

        return "form";
    }
    @PostMapping("add")
    public String addForm(@ModelAttribute("email") Email email,Model model){
        model.addAttribute("email",email);
        return "/edit";
    }
}
