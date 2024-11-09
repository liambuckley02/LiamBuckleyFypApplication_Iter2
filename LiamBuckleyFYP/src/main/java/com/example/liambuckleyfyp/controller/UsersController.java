//Below code is taken from a YouTube tutorial by Java Master (2021) on how to create a user register and login page
package com.example.liambuckleyfyp.controller;

import com.example.liambuckleyfyp.service.UsersService;
import org.springframework.ui.Model;
import com.example.liambuckleyfyp.model.UsersModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    private final UsersService usersService;

    // Constructor to inject UsersService dependency
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    // Handler method for GET requests to /register
    @GetMapping("/register")
    public String getRegisterPage(Model model){
        // Add a new UsersModel object to the model with the attribute name "registerRequest"
        model.addAttribute("registerRequest", new UsersModel());
        // Return the name of the view to be rendered (register_page.html)
        return "register_page";
    }

    // Handler method for GET requests to /login
    @GetMapping("/login")
    public String getLoginPage(Model model){
        // Add a new UsersModel object to the model with the attribute name "loginRequest"
        model.addAttribute("loginRequest", new UsersModel());
        // Return the name of the view to be rendered (login_page.html)
        return "login_page";
    }

    // Handler method for POST requests to /register
    @PostMapping("/register")
    public String register(@ModelAttribute UsersModel usersModel){
        // Log the register request
        System.out.println("register request: " + usersModel);
        // Call the registerUser method of usersService to register the user
        UsersModel registeredUser = usersService.registerUser(usersModel.getLogin(), usersModel.getPassword(), usersModel.getEmail());
        // If registration is successful, redirect to the login page, otherwise return the error page
        return registeredUser == null ? "error_page" : "redirect:/login";
    }

    // Handler method for POST requests to /login
    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model){
        // Log the login request
        System.out.println("login request: " + usersModel);
        // Call the authenticate method of usersService to authenticate the user
        UsersModel authenticated = usersService.authenticate(usersModel.getLogin(), usersModel.getPassword());
        // If authentication is successful, add the user's login to the model and return the personal page, otherwise return the error page
        if(authenticated != null){
            model.addAttribute("userLogin", authenticated.getLogin());
            return "personal_page";
        } else {
            return "error_page";
        }
    }
}

//References
// Java Master (2021). Java Web Project | Create Login and Register Form From Scratch with, Java11, Spring MVC, PostgreSQL. [online] YouTube. Available at: https://www.youtube.com/watch?v=x_nfnVU0wAI [Accessed 2 Nov. 2024].