package com.company.project.service.impl;

import com.company.project.dao.DictMapper;
import com.company.project.dto.DictDTO;
import com.company.project.model.Dict;
import com.company.project.service.DictService;
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
public class DictServiceImpl extends AbstractService<Dict> implements DictService {
    @Resource
    private DictMapper dictMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public Dict addDict(DictDTO dto){
        Dict dict = new Dict();
        dict.setId(uuid.getUUID());

        int rows = this.save(dict);
        if (rows == 1) {
            return dict;
        } else {
            throw new ServiceException("dict添加失败");
        }
    }

    @Override
    public int updateDict(String id, DictDTO dto){
        Dict dict = new Dict();
        dict.setId(id);

        int rows = this.update(dict);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("dict更新失败");
        }
    }

    @Override
    public int deleteDict(String id){
        Dict dict = new Dict();
        dict.setId(id);
        int rows = this.update(dict);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("dict删除失败");
        }
    }
}
