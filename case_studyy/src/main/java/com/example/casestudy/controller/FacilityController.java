package com.example.casestudy.controller;

import com.example.casestudy.model.Facility;
import com.example.casestudy.service.IFacitilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/facility")
public class FacilityController {
     @Autowired
     IFacitilyService facitilyService;

    @GetMapping("")
    public String showAll(Model model){
        List<Facility> facilityList = facitilyService.findAll();
        model.addAttribute("facilityList", facilityList);
        return "facility/list";
    }
}
