package com.example.controllers;

/**
 *
 * @author sith
 */
import com.example.models.Article;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {
    @GetMapping("/rest")
    public ResponseEntity<Article> api(Model model) {
        Article article = new Article("label", "short", "some random info");
        return new ResponseEntity<>(article, HttpStatus.CREATED);
    }
}
