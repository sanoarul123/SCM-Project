package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.helpers.Message;
import com.scm.helpers.MessageType;
import com.scm.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class PageControllers {

    @Autowired
    private UserService userService;

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
    public String processRegister(@Valid @ModelAttribute UserForm userForm,BindingResult rBindingResult, HttpSession session) {

        System.out.println("Processing registration");

        System.out.println(userForm);


        // data validation

        if (rBindingResult.hasErrors()) {
            return "register";
            
        }


        // User user = User.builder()
        // .name(userForm.getName())
        // .email(userForm.getEmail())
        // .password(userForm.getPassword())
        // .about(userForm.getAbout())
        // .phonenumber(userForm.getPhoneNumber())
        // .profilepic("https://codeforces.org/s/53835/images/codeforces-sponsored-by-ton.png")
        // .build();

        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setAbout(userForm.getAbout());
        user.setPhonenumber(userForm.getPhoneNumber());
        user.setProfilepic("https://codeforces.org/s/53835/images/codeforces-sponsored-by-ton.png\"");

        userService.saveUser(user);

        System.out.println("user saved : ");


       // Message message = Message.builder().content("This is the content").type(MessageType.green).build();
         Message message = Message.builder().content("Registration Successful").type(MessageType.green).build();
        session.setAttribute("message",message);

        return "redirect:/register";
    }

}
