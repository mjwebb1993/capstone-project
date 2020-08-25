package com.example.capstoneproject.controllers;

import com.example.capstoneproject.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
}
