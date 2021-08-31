package com.example.controllers;

/**
 *
 * @author sith
 */
import com.example.config.AnimalConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.models.Animal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        
        ApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(AnimalConfig.class);
        Animal animal = javaConfigContext.getBean(Animal.class);
        
        model.addAttribute("title", animal.getVoice());
        return "home-main";
    }
                
    @GetMapping("/home")
    public String about(Model model) {
        model.addAttribute("title", "home page");
        return "home-main";
    }
}
