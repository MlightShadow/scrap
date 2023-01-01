package com.company.project.dto.account;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by CodeGenerator on 2019/03/28.
 */
public class RegisterDTO {
    @ApiModelProperty(value="用户名")
    private String username;
    @ApiModelProperty(value="注册邮箱")
    private String regmail;
    @ApiModelProperty(value="密码")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegmail() {
        return regmail;
    }

    public void setRegmail(String regmail) {
        this.regmail = regmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}