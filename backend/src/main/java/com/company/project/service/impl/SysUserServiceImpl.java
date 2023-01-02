package com.company.project.service.impl;

import com.company.project.dao.SysUserMapper;
import com.company.project.dto.SysUserDTO;
import com.company.project.model.SysUser;
import com.company.project.service.SysUserService;
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
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public SysUser addSysUser(SysUserDTO dto){
        SysUser sysUser = new SysUser();
        sysUser.setId(uuid.getUUID());
        // sysUser.setCreateTime(new Date());
        // sysUser.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(sysUser);
        if (rows == 1) {
            return sysUser;
        } else {
            throw new ServiceException("sysUser添加失败");
        }
    }

    @Override
    public int updateSysUser(String id, SysUserDTO dto){
        SysUser sysUser = new SysUser();
        sysUser.setId(id);

        int rows = this.update(sysUser);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("sysUser更新失败");
        }
    }

    @Override
    public int deleteSysUser(String id){
        SysUser sysUser = new SysUser();
        sysUser.setId(id);
        int rows = this.update(sysUser);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("sysUser删除失败");
        }
    }
}
