package com.example.capstoneproject.controllers;


import com.example.capstoneproject.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("fileindex")
    public String displayFileIndex(Model model) {

        return "users/fileindex";
    }

    @GetMapping("DBFile")
    public String displayUserFiles(Model model) {

        return "users/DBFile";
    }

    @GetMapping("home")
    public String displayUserHome(Model model) {

        return "users/home";
    }
}
