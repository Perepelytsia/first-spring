package com.example.repo;

import com.example.models.Article;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sith
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {
    
}
