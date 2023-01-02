package com.company.project.service.impl;

import com.company.project.dao.ArticleLogMapper;
import com.company.project.dto.ArticleLogDTO;
import com.company.project.model.ArticleLog;
import com.company.project.service.ArticleLogService;
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
public class ArticleLogServiceImpl extends AbstractService<ArticleLog> implements ArticleLogService {
    @Resource
    private ArticleLogMapper articleLogMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public ArticleLog addArticleLog(ArticleLogDTO dto){
        ArticleLog articleLog = new ArticleLog();
        articleLog.setId(uuid.getUUID());
        // articleLog.setCreateTime(new Date());
        // articleLog.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(articleLog);
        if (rows == 1) {
            return articleLog;
        } else {
            throw new ServiceException("articleLog添加失败");
        }
    }

    @Override
    public int updateArticleLog(String id, ArticleLogDTO dto){
        ArticleLog articleLog = new ArticleLog();
        articleLog.setId(id);

        int rows = this.update(articleLog);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("articleLog更新失败");
        }
    }

    @Override
    public int deleteArticleLog(String id){
        ArticleLog articleLog = new ArticleLog();
        articleLog.setId(id);
        int rows = this.update(articleLog);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("articleLog删除失败");
        }
    }
}
