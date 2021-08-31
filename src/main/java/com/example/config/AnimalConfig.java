/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.config;

import com.example.models.ReactionImpl;
import com.example.models.Reaction;
import com.example.models.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sith
 */
@Configuration
public class AnimalConfig {
    @Bean
    public Animal createAnimal() {
        return new Animal();
    }
    
    @Bean
    public Reaction createReaction() {
        return new ReactionImpl();
    }
}
