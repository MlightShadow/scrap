package com.company.project.service;

import com.company.project.model.ArticleTag;
import com.company.project.dto.ArticleTagDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface ArticleTagService extends Service<ArticleTag> {
    ArticleTag addArticleTag(ArticleTagDTO dto);

    int updateArticleTag(String id, ArticleTagDTO dto);
    
    int deleteArticleTag(String id);
}
