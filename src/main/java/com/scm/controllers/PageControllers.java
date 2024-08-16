package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.scm.forms.UserForm;

@Controller
public class PageControllers {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page1 Handler");
        model.addAttribute("name", "Substring sanoar");

        return "home";
    }

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("Login");
    }

    @GetMapping("/register")
    public String register(Model model) {
       UserForm userForm = new UserForm();

      
       model.addAttribute("userForm", userForm);

       return "register";
    }

    @RequestMapping("/about")
    public String about(Model model) {

        System.out.println("This is about page");

        return "about";
    }

    @RequestMapping("/services")
    public String services() {
        System.out.println("This is services page");

        return "services";
    }
    // Processing register

    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm){

        System.out.println("Processing registration");

        System.out.println(userForm);

        return "redirect:/register";
    }

}
