package com.company.project.service;

import com.company.project.model.Tag;
import com.company.project.dto.TagDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface TagService extends Service<Tag> {
    Tag addTag(TagDTO dto);

    int updateTag(String id, TagDTO dto);
    
    int deleteTag(String id);
}
