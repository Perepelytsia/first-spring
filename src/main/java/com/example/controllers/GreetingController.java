/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.models.Animal;
import com.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    
    @Autowired
    private Animal creature;
    
    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }
    
    @GetMapping("/greeting")
    @ResponseBody
    public String about(Model model) {
        //return this.service.greet();
        return creature.getVoice();
    }
}
