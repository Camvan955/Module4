package com.example.casestudy.controller;

import com.example.casestudy.model.Customer;
import com.example.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String ListCustomer(@RequestParam(defaultValue = "") String search, @PageableDefault(page = 0, size = 5) Pageable pageable, ModelMap modelMap){
        Page<Customer> customerPage = customerService.findAll(pageable);
//        modelMap.addAttribute("listCustomerDto",)
    return null;
    }
}
