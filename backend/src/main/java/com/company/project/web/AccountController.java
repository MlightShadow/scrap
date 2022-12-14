package com.company.project.web;

import com.company.project.aop.NeedApiLog;
import com.company.project.aop.TargetDataSource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dto.account.AccountDTO;
import com.company.project.dto.account.RegisterDTO;
import com.company.project.model.Account;
import com.company.project.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by CodeGenerator on 2019/03/28.
 */
@Api(description = "后台账号")
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @NeedApiLog
    @ApiOperation(value = "注册")
    @PostMapping("/register")
    @TargetDataSource("auth")
    public Result<?> register(@RequestBody RegisterDTO dto) {
        return ResultGenerator.genSuccessResult(accountService.addAccount(dto));
    }

    @NeedApiLog
    @ApiIgnore
    @ApiOperation(value = "删除")
    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable String id) {
        return ResultGenerator.genSuccessResult(accountService.deleteAccount(id));
    }

    @NeedApiLog
    @ApiIgnore
    @ApiOperation(value = "更新")
    @PutMapping("/{id}")
    public Result<?> update(@PathVariable String id, @RequestBody AccountDTO dto) {
        return ResultGenerator.genSuccessResult(accountService.updateAccount(id, dto));
    }

    @ApiIgnore
    @ApiOperation(value = "数据源测试")
    @GetMapping("test/{type}")
    @TargetDataSource("auth")
    @NeedApiLog
    public Result<?> test(@PathVariable String type) {
        return ResultGenerator.genSuccessResult("okay");
    }

    @ApiOperation(value = "详情")
    @GetMapping("/{id}")
    @TargetDataSource("auth")
    public Result<?> detail(@PathVariable String id) {
        Account account = accountService.findById(id);
        return ResultGenerator.genSuccessResult(account);
    }

    @ApiOperation(value = "列表")
    @GetMapping
    @TargetDataSource("auth")
    public Result<?> list(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Account> list = accountService.findAll();
        PageInfo<?> pageInfo = new PageInfo<Account>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
