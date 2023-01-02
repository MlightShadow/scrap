package com.company.project.service;

import com.company.project.model.ArticleAttach;
import com.company.project.dto.ArticleAttachDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface ArticleAttachService extends Service<ArticleAttach> {
    ArticleAttach addArticleAttach(ArticleAttachDTO dto);

    int updateArticleAttach(String id, ArticleAttachDTO dto);
    
    int deleteArticleAttach(String id);
}
