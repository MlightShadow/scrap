package com.company.project.web;

import com.company.project.aop.NeedApiLog;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dto.UserTokenDTO;

import com.company.project.model.UserToken;

import com.company.project.service.UserTokenService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.annotations.ApiIgnore;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;

import java.util.List;

/**
* Created by CodeGenerator on 2023/01/02.
*/
@ApiIgnore
@Api(description="UserToken")
@RestController
@RequestMapping("/user/token")
public class UserTokenController {
    @Resource
    private UserTokenService userTokenService;

    @NeedApiLog
    @ApiOperation(value="新增")
    @PostMapping
    public Result<?> add(@RequestBody UserTokenDTO dto) {
        return ResultGenerator.genSuccessResult(userTokenService.addUserToken(dto));
    }

    @NeedApiLog
    @ApiOperation(value="删除")
    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable String id) {
        return ResultGenerator.genSuccessResult(userTokenService.deleteUserToken(id));
    }

    @NeedApiLog
    @ApiOperation(value="更新")
    @PutMapping("/{id}")
    public Result<?> update(@PathVariable String id, @RequestBody UserTokenDTO dto) {
        return ResultGenerator.genSuccessResult(userTokenService.updateUserToken(id, dto));
    }

    @ApiOperation(value="详情")
    @GetMapping("/{id}")
    public Result<?> detail(@PathVariable String id) {
        UserToken userToken = userTokenService.findById(id);
        return ResultGenerator.genSuccessResult(userToken);
    }

    @ApiOperation(value="列表")
    @GetMapping
    public Result<?> list(@RequestParam(defaultValue = "0") Integer page, 
            @RequestParam(defaultValue = "0") Integer size,
            @RequestParam(defaultValue = "") @ApiParam(required = false) String searchString) {
        PageHelper.startPage(page, size);
        Condition condition = new Condition(UserToken.class);

        Condition.Criteria baseCondition = condition.createCriteria();
        baseCondition.andCondition("is_deleted=", false);

        if (!StringUtils.isBlank(searchString)) {
            Condition.Criteria searchCondition = condition.createCriteria();
            condition.and(searchCondition);
        }

        List<UserToken> list = userTokenService.findByCondition(condition);
        PageInfo<?> pageInfo = new PageInfo<UserToken>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
