package com.example.capstoneproject.controllers;

import com.example.capstoneproject.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="")
    public String displayIndex(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }

    @GetMapping(value="chat")
    public String displayIndexChat(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "chat";
    }
}
