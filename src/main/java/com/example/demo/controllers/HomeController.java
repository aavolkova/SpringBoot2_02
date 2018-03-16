package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping( "/")
    public String homePage(Model model) {

        String myVar = "Say hello to the people.";
        model.addAttribute("myvar", myVar);
        return "hometemplate";
    }

}
