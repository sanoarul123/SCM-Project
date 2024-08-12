package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {

        model.addAttribute("name", "Substring value of sanoar");
        model.addAttribute("Youtubechanner", "Sanoarul islam");

        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("This is about page");

        return "about";
    }

    @RequestMapping("/services")
    public String services() {
        System.out.println("This is services page");

        return "services";
    }

}
