package com.example.casestudy.controller;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.dto.FacilityDto;
import com.example.casestudy.dto.FacilityView;
import com.example.casestudy.model.Facility;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.repository.facility.IFacilityRepository;
import com.example.casestudy.service.IFacilityService;
import com.example.casestudy.service.IFacilityTypeService;
import com.example.casestudy.service.IRentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/facilities")
public class FacilityController {

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IRentTypeService rentTypeService;

    @Autowired
    private IFacilityTypeService facilityTypeService;

    @GetMapping("")
    public String ListFacility(@RequestParam(defaultValue = "") String name,
                               @RequestParam(defaultValue = "") String facilityType,
                               @PageableDefault(page = 0, size = 3) Pageable pageable, Model modelMap) {
        Page<Facility> facilityPage = facilityService.searchView(name, facilityType, pageable);
        modelMap.addAttribute("listFacility", facilityPage);
        modelMap.addAttribute("facilityTypeList", facilityTypeService.findAll());
        return "facility/list";
    }
    @GetMapping("/create-facitily")
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
        BeanUtils.copyProperties(facilityDto, facility);
        facilityService.save(facility);
        ModelAndView modelAndView = new ModelAndView("facility/create");
        modelAndView.addObject("message", "Thêm mới dịch vụ thành công!");
        return modelAndView;
    }

    @GetMapping("/edit-facility")
    public String editFacility(@RequestParam(defaultValue = "") String search
            , Integer id, Model model) {
        Optional<Facility> facility = facilityService.findById(id);
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("facilityDto", facility.get());
        return "facility/edit";
    }
    @PostMapping("/update")
    public String updateListFacility(@Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, RedirectAttributes redirect, Model model) {
        Facility facility=new Facility();
        facilityService.save(facility);
        redirect.addFlashAttribute("message", "Sửa thành công!");
        return "redirect:/customers";
    }





    @PostMapping("/delete-facility")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        facilityService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Xóa thành công");
        return "redirect:/facilities";
    }
}
