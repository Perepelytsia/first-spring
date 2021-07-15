package com.example.controllers;

/**
 *
 * @author sith
 */
import com.example.models.Article;
import com.example.repo.ArticleRepository;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogController {
    
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        model.addAttribute("title", "blog page");
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles", articles);
        return "blog-main";
    }
    
    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        return "blog-add";
    }
    
    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Article article = new Article(title, anons, full_text);
        articleRepository.save(article);
        return "redirect:/blog";
    }
    
    @GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable Long id, Model model) {
        Optional<Article> wrapArticle = articleRepository.findById(id);
        if (wrapArticle.isPresent()) {
            Article article = wrapArticle.get();
            model.addAttribute("article", article);
            return "blog-details";
        } else {
            return "redirect:/blog";
        }
    }
}
