package com.aynodkar.Smart.Contact.Manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");

        // sending data to view
        model.addAttribute("name","Aynodkar Vishal");
        model.addAttribute("role","Software Engg");
        model.addAttribute("github","https://github.com/AynodkarVC");
        return "home";
    }
}
