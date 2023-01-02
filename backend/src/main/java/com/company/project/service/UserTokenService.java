package com.company.project.service;

import com.company.project.model.UserToken;
import com.company.project.dto.UserTokenDTO;
import com.company.project.core.Service;

/**
 * Created by CodeGenerator on 2023/01/02.
 */
public interface UserTokenService extends Service<UserToken> {
    UserToken addUserToken(UserTokenDTO dto);

    int updateUserToken(String id, UserTokenDTO dto);
    
    int deleteUserToken(String id);
}
