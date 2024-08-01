package com.scm.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageControllers {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home page Handler");
        return "home";
    }
}



