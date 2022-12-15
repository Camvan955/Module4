package com.example.casestudy.controller;

import com.example.casestudy.model.ContractDetail;
import com.example.casestudy.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract-detail")
public class ContractDetailController {
    @Autowired
    private IContractDetailService contractDetailService;

    @PostMapping("/save")
    public String createContractDetail(@ModelAttribute("contractDetail")ContractDetail contractDetail, RedirectAttributes redirectAttributes){
        contractDetailService.save(contractDetail);
        redirectAttributes.addFlashAttribute("message", "Thêm mới hợp đồng chi tiết thành công!");
        return "redirect:/contracts";
    }

}
