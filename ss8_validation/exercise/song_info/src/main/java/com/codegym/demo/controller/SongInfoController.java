package com.codegym.demo.controller;

import com.codegym.demo.dto.SongInfoDto;
import com.codegym.demo.model.SongInfo;
import com.codegym.demo.service.ISongInfoService;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class SongInfoController {

    @Autowired
    private ISongInfoService songInfoService;

    @GetMapping("/songInfos")
    public String listSongInfo(@RequestParam(defaultValue = "") String search, @PageableDefault(page = 0, size = 5) Pageable pageable, ModelMap modelMap) {
        Page<SongInfo> songInfoPage = songInfoService.findAll(pageable);
        modelMap.addAttribute("songInfoPage", songInfoPage);
        return "/songInfo/list";
    }

    @GetMapping("/create-songInfo")
    public String showCreateForm(Model model) {
        model.addAttribute("songInfoDto", new SongInfoDto());
        return "/songInfo/create";
    }

    @PostMapping("/create-songInfo")
    public ModelAndView saveSongInfo(@Validated @ModelAttribute("songInfoDto") SongInfoDto songInfoDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("/songInfo/create");
            return modelAndView;
        }
        SongInfo songInfo = new SongInfo();
        BeanUtils.copyProperties(songInfoDto,songInfo);
        songInfoService.save(songInfo);
        ModelAndView modelAndView = new ModelAndView("/songInfo/create");
        modelAndView.addObject("message", "New song info created successfully");
        return modelAndView;
    }


    @GetMapping("/edit-songInfo/{id}")
    public String showFromEdit(@PathVariable int id, Model model){
        Optional<SongInfo> songInfo = songInfoService.findByTd(id);
            model.addAttribute("songInfoDto", songInfo.get());
            return "songInfo/edit";
    }

    @PostMapping("/edit-songInfo")
    public String edit( @Validated @ModelAttribute("songInfoDto") SongInfoDto songInfoDto,BindingResult bindingResult , Model model, RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()){
            return "songInfo/edit";
        }
        SongInfo songInfo = new SongInfo();
        BeanUtils.copyProperties(songInfoDto, songInfo);
        songInfoService.save(songInfo);
        model.addAttribute("songInfo", songInfo);
        redirectAttributes.addFlashAttribute("message", " Song Info update Successfully");
        return "redirect:/songInfos";
    }
}
