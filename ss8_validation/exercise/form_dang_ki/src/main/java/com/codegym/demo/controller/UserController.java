package com.codegym.demo.controller;

import com.codegym.demo.dto.UserDto;
import com.codegym.demo.model.User;
import com.codegym.demo.service.IUserService;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public String listUsers(@RequestParam(defaultValue = "") String search, @PageableDefault(page = 0, size = 5) Pageable pageable, ModelMap modelMap) {
        Page<User> userPage = userService.findAll(pageable);
        modelMap.addAttribute("userPage", userPage);
        return "/user/list";
    }

    @GetMapping("/create-user")
    public String showCreateForm(Model model) {
        model.addAttribute("userDto",new UserDto());
        return "user/create";
    }

    @PostMapping("/create-user")
    public ModelAndView saveUser(@Validated @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult) {

        // cách 2
//        new UserDto().validate(userDto, bindingResult);

        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("/user/create");
            return modelAndView;
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("/user/create");
        modelAndView.addObject("message", "New user created successfully");
        return modelAndView;
    }

}
