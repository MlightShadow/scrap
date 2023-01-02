package com.company.project.service.impl;

import com.company.project.dao.ArticleAttachMapper;
import com.company.project.dto.ArticleAttachDTO;
import com.company.project.model.ArticleAttach;
import com.company.project.service.ArticleAttachService;
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
public class ArticleAttachServiceImpl extends AbstractService<ArticleAttach> implements ArticleAttachService {
    @Resource
    private ArticleAttachMapper articleAttachMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public ArticleAttach addArticleAttach(ArticleAttachDTO dto){
        ArticleAttach articleAttach = new ArticleAttach();
        articleAttach.setId(uuid.getUUID());
        // articleAttach.setCreateTime(new Date());
        // articleAttach.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(articleAttach);
        if (rows == 1) {
            return articleAttach;
        } else {
            throw new ServiceException("articleAttach添加失败");
        }
    }

    @Override
    public int updateArticleAttach(String id, ArticleAttachDTO dto){
        ArticleAttach articleAttach = new ArticleAttach();
        articleAttach.setId(id);

        int rows = this.update(articleAttach);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("articleAttach更新失败");
        }
    }

    @Override
    public int deleteArticleAttach(String id){
        ArticleAttach articleAttach = new ArticleAttach();
        articleAttach.setId(id);
        int rows = this.update(articleAttach);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("articleAttach删除失败");
        }
    }
}
