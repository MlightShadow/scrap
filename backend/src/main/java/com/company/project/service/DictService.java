package com.company.project.service;

import com.company.project.model.Dict;
import com.company.project.dto.DictDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface DictService extends Service<Dict> {
    Dict addDict(DictDTO dto);

    int updateDict(String id, DictDTO dto);
    
    int deleteDict(String id);
}
