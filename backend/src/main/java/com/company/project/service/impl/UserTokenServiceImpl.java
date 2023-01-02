package com.company.project.service.impl;

import com.company.project.dao.UserTokenMapper;
import com.company.project.dto.UserTokenDTO;
import com.company.project.model.UserToken;
import com.company.project.service.UserTokenService;
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
public class UserTokenServiceImpl extends AbstractService<UserToken> implements UserTokenService {
    @Resource
    private UserTokenMapper userTokenMapper;

    @Autowired
    private SecurityContextUtil securityContextUtil;

    @Autowired
    private UUIDUtil uuid;

    @Override
    public UserToken addUserToken(UserTokenDTO dto){
        UserToken userToken = new UserToken();
        userToken.setId(uuid.getUUID());
        // userToken.setCreateTime(new Date());
        // userToken.setCreator(securityContextUtil.getAuthInfo().getId());

        int rows = this.save(userToken);
        if (rows == 1) {
            return userToken;
        } else {
            throw new ServiceException("userToken添加失败");
        }
    }

    @Override
    public int updateUserToken(String id, UserTokenDTO dto){
        UserToken userToken = new UserToken();
        userToken.setId(id);

        int rows = this.update(userToken);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("userToken更新失败");
        }
    }

    @Override
    public int deleteUserToken(String id){
        UserToken userToken = new UserToken();
        userToken.setId(id);
        int rows = this.update(userToken);
        if (rows == 1) {
            return rows;
        } else {
            throw new ServiceException("userToken删除失败");
        }
    }
}
