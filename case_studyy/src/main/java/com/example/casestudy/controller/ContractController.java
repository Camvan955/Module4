package com.example.casestudy.controller;

import com.example.casestudy.dto.ContractDto;
import com.example.casestudy.model.Contract;
import com.example.casestudy.model.ContractDetail;
import com.example.casestudy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contracts")
public class ContractController {
    @Autowired
    private IContractService contractService;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IAttachFacilityService attachFacilityService;

    @GetMapping("")
    public String listContract(@RequestParam(defaultValue = "") String name, @PageableDefault(page = 0, size = 3) Pageable pageable, Model model) {
        Page<ContractDto> contactList = contractService.findContract(pageable);
        ContractDetail contractDetail= new ContractDetail();

        model.addAttribute("contractDetail", contractDetail);
        model.addAttribute("listContract", contactList);
        model.addAttribute("listAttachFacility", attachFacilityService.findAll());
        return "contract/list";
    }

    @GetMapping("/create-contract")
    public String createContract(Model model, Pageable pageable) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("customerList", customerService.findAll(pageable));
        model.addAttribute("employeeList", employeeService.findAll(pageable));
        model.addAttribute("facilityList", facilityService.findAll(pageable));
        return "contract/create";
    }

    @PostMapping("/save-contract")
    public ModelAndView saveContract(@ModelAttribute("contract") Contract contract) {
        contractService.save(contract);
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("message", "Th??m m???i h???p ?????ng th??nh c??ng!");
        return modelAndView;
    }



}
