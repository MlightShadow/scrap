package com.company.project.service.impl;

import com.company.project.dao.ArticleMapper;
import com.company.project.dto.ArticleDTO;
import com.company.project.model.Article;
import com.company.project.service.ArticleService;
import com.company.project.util.SecurityContextUtil;
import com.company.project.util.UUIDUtil;
import com.company.project.core.AbstractService;
import com.company.project.core.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public Article addArticle(ArticleDTO dto){
        Article article = new Article();
        article.setId(uuid.getUUID());
        article.setFlag(0);

        int rows = this.save(article);
        if (rows == 1) {
            return article;
        } else {
            throw new ServiceException("article添加失败");
        }
    }

    @Override
    public int updateArticle(String id, ArticleDTO dto){
        Article article = new Article();
        article.setId(id);

        int rows = this.update(article);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("article更新失败");
        }
    }

    @Override
    public int deleteArticle(String id){
        Article article = new Article();
        article.setId(id);
        article.setFlag(1);
        int rows = this.update(article);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("article删除失败");
        }
    }
}
