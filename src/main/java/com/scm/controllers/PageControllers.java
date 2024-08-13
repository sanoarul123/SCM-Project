package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page1 Handler");
        model.addAttribute("name", "Substring sanoar");

        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        // model.addAttribute("isLogin", true);

        System.out.println("This is about page");

        return "about";
    }

    @RequestMapping("/services")
    public String services() {
        System.out.println("This is services page");

        return "services";
    }
}
