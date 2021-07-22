package com.example.controllers;

/**
 *
 * @author sith
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "home page");
        return "home-main";
    }
                
    @GetMapping("/home")
    public String about(Model model) {
        model.addAttribute("title", "home page");
        return "home-main";
    }
}
