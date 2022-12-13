package com.example.casestudy.controller;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.service.ICustomerService;
import com.example.casestudy.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;


    @GetMapping("customers")
    public String listCustomer(@RequestParam(defaultValue = "") String name,@RequestParam(defaultValue = "") String email,@RequestParam(defaultValue = "") String customerType, @PageableDefault(page = 0, size = 5) Pageable pageable, Model model) {
        Page<Customer> customerList = customerService.searchByName(name, email, customerType, pageable);
        model.addAttribute("listCustomerDto", customerList);
        model.addAttribute("customerTypeList", customerService.findAll(pageable));
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("customerType", customerType);
        return "customer/list";
    }

    @GetMapping("create-customer")
    public String createCustomer(Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create";
    }

    @PostMapping("/save-customer")
    public ModelAndView saveCustomer(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("customer/create");
            modelAndView.addObject("message", "Thêm mới khách hàng không thành công!");
            return modelAndView;
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("message", "Thêm mới khách hàng thành công!");
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public String edit(@RequestParam(defaultValue = "") String search
            ,@PathVariable("id") Integer id, Model model) {
        Optional<Customer> customer = customerService.findById(id);
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", customer.get());
        return "customer/edit";
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult , RedirectAttributes redirect, Model model) {
        new CustomerDto().validate(customerDto,bindingResult);
        if(bindingResult.hasErrors()){
            return "customer/edit";
        }
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        customerService.save(customer);
        redirect.addFlashAttribute("message", "Sửa thành công!");
        return "redirect:/customers";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id,RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message","Xoá thành công");
        return "redirect:/customers";
    }



}
