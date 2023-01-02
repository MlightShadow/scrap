package com.company.project.service;

import com.company.project.model.UploadFile;
import com.company.project.dto.UploadFileDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface UploadFileService extends Service<UploadFile> {
    UploadFile addUploadFile(UploadFileDTO dto);

    int updateUploadFile(String id, UploadFileDTO dto);
    
    int deleteUploadFile(String id);
}
