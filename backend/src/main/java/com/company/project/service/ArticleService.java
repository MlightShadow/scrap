package com.company.project.service;

import com.company.project.model.Article;
import com.company.project.dto.ArticleDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface ArticleService extends Service<Article> {
    Article addArticle(ArticleDTO dto);

    int updateArticle(String id, ArticleDTO dto);
    
    int deleteArticle(String id);
}
