package com.example.casestudy.controller;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.dto.FacilityDto;
import com.example.casestudy.model.Facility;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.repository.facility.IFacilityRepository;
import com.example.casestudy.service.IFacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class FacilityController {

    @Autowired
    private IFacilityService facilityService;

    @GetMapping("/facilities")
    public String ListFacility(@RequestParam(defaultValue = "") String search, @PageableDefault(page = 0, size = 3) Pageable pageable, ModelMap modelMap) {
        Page<Facility> facilityPage = facilityService.findAll(pageable);
        modelMap.addAttribute("listFacility", facilityPage);
        return "facility/list";
    }
    @GetMapping("create-facitily")
    public String createFacility(Model model) {
        model.addAttribute("facilityDto", new FacilityDto());
        return "facility/create";
    }

    @PostMapping("/save-facility")
    public ModelAndView saveFacility( @ModelAttribute("facilityDto") FacilityDto facilityDto ) {

//        if (bindingResult.hasErrors()) {
//            ModelAndView modelAndView = new ModelAndView("facility/create");
//            modelAndView.addObject("message", "Thêm mới dịch vụ không thành công!");
//            return modelAndView;
//        }
        Facility facility = new Facility();
//
        BeanUtils.copyProperties(facilityDto, facility);
        facilityService.save(facility);
        ModelAndView modelAndView = new ModelAndView("facility/create");
        modelAndView.addObject("message", "Thêm mới dịch vụ thành công!");
        return modelAndView;
    }
}
