package com.company.project.service.impl;

import com.company.project.dao.ArticleTagMapper;
import com.company.project.dto.ArticleTagDTO;
import com.company.project.model.ArticleTag;
import com.company.project.service.ArticleTagService;
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
public class ArticleTagServiceImpl extends AbstractService<ArticleTag> implements ArticleTagService {
    @Resource
    private ArticleTagMapper articleTagMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public ArticleTag addArticleTag(ArticleTagDTO dto){
        ArticleTag articleTag = new ArticleTag();
        articleTag.setId(uuid.getUUID());
        // articleTag.setCreateTime(new Date());
        // articleTag.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(articleTag);
        if (rows == 1) {
            return articleTag;
        } else {
            throw new ServiceException("articleTag添加失败");
        }
    }

    @Override
    public int updateArticleTag(String id, ArticleTagDTO dto){
        ArticleTag articleTag = new ArticleTag();
        articleTag.setId(id);

        int rows = this.update(articleTag);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("articleTag更新失败");
        }
    }

    @Override
    public int deleteArticleTag(String id){
        ArticleTag articleTag = new ArticleTag();
        articleTag.setId(id);
        int rows = this.update(articleTag);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("articleTag删除失败");
        }
    }
}
