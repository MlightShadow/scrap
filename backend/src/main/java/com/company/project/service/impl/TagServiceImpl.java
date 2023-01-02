package com.company.project.service.impl;

import com.company.project.dao.TagMapper;
import com.company.project.dto.TagDTO;
import com.company.project.model.Tag;
import com.company.project.service.TagService;
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
public class TagServiceImpl extends AbstractService<Tag> implements TagService {
    @Resource
    private TagMapper tagMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public Tag addTag(TagDTO dto){
        Tag tag = new Tag();
        tag.setId(uuid.getUUID());
        // tag.setCreateTime(new Date());
        // tag.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(tag);
        if (rows == 1) {
            return tag;
        } else {
            throw new ServiceException("tag添加失败");
        }
    }

    @Override
    public int updateTag(String id, TagDTO dto){
        Tag tag = new Tag();
        tag.setId(id);

        int rows = this.update(tag);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("tag更新失败");
        }
    }

    @Override
    public int deleteTag(String id){
        Tag tag = new Tag();
        tag.setId(id);
        int rows = this.update(tag);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("tag删除失败");
        }
    }
}
