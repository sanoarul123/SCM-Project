package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {

        model.addAttribute("name", "Substring value of sanoar");
        model.addAttribute("Youtubechanner", "Sanoarul islam");

        return "home";
    }
}
