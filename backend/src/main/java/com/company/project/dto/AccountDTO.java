package com.company.project.dto;

import io.swagger.annotations.ApiModelProperty;

/**
* Created by CodeGenerator on 2020/09/01.
*/
public class AccountDTO {
    @ApiModelProperty(value="用户名")
    private String username;
    @ApiModelProperty(value="注册邮箱")
    private String regmail;
    @ApiModelProperty(value="密码")
    private String password;
}