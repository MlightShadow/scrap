package com.company.project.service;

import com.company.project.model.SysUser;
import com.company.project.dto.SysUserDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface SysUserService extends Service<SysUser> {
    SysUser addSysUser(SysUserDTO dto);

    int updateSysUser(String id, SysUserDTO dto);
    
    int deleteSysUser(String id);
}
