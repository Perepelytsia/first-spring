/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controllers;

import com.example.models.Reaction;
import com.example.models.ReactionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReactionController {
    
    @Autowired
    private Reaction action;
    
    @GetMapping("/reaction")
    @ResponseBody
    public String reaction(Model model) {
        return action.getIt();
    }
}
