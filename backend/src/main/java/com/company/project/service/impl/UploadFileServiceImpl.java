package com.company.project.service.impl;

import com.company.project.dao.UploadFileMapper;
import com.company.project.dto.UploadFileDTO;
import com.company.project.model.UploadFile;
import com.company.project.service.UploadFileService;
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
public class UploadFileServiceImpl extends AbstractService<UploadFile> implements UploadFileService {
    @Resource
    private UploadFileMapper uploadFileMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public UploadFile addUploadFile(UploadFileDTO dto){
        UploadFile uploadFile = new UploadFile();
        uploadFile.setId(uuid.getUUID());
        uploadFile.setFlag(0);
        // uploadFile.setCreateTime(new Date());
        // uploadFile.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(uploadFile);
        if (rows == 1) {
            return uploadFile;
        } else {
            throw new ServiceException("uploadFile添加失败");
        }
    }

    @Override
    public int updateUploadFile(String id, UploadFileDTO dto){
        UploadFile uploadFile = new UploadFile();
        uploadFile.setId(id);

        int rows = this.update(uploadFile);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("uploadFile更新失败");
        }
    }

    @Override
    public int deleteUploadFile(String id){
        UploadFile uploadFile = new UploadFile();
        uploadFile.setId(id);
        uploadFile.setFlag(1);
        int rows = this.update(uploadFile);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("uploadFile删除失败");
        }
    }
}
