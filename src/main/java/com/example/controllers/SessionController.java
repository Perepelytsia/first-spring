package com.example.controllers;

/**
 *
 * @author sith
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String about(Model model) {
        return "session";
    }
}
