package com.company.project.service;

import com.company.project.model.ArticleLog;
import com.company.project.dto.ArticleLogDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface ArticleLogService extends Service<ArticleLog> {
    ArticleLog addArticleLog(ArticleLogDTO dto);

    int updateArticleLog(String id, ArticleLogDTO dto);
    
    int deleteArticleLog(String id);
}
