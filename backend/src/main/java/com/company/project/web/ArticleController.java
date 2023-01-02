package com.company.project.web;

import com.company.project.aop.NeedApiLog;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dto.ArticleDTO;

import com.company.project.model.Article;

import com.company.project.service.ArticleService;

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
@Api(description="Article")
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @NeedApiLog
    @ApiOperation(value="新增")
    @PostMapping
    public Result<?> add(@RequestBody ArticleDTO dto) {
        return ResultGenerator.genSuccessResult(articleService.addArticle(dto));
    }

    @NeedApiLog
    @ApiOperation(value="删除")
    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable String id) {
        return ResultGenerator.genSuccessResult(articleService.deleteArticle(id));
    }

    @NeedApiLog
    @ApiOperation(value="更新")
    @PutMapping("/{id}")
    public Result<?> update(@PathVariable String id, @RequestBody ArticleDTO dto) {
        return ResultGenerator.genSuccessResult(articleService.updateArticle(id, dto));
    }

    @ApiOperation(value="详情")
    @GetMapping("/{id}")
    public Result<?> detail(@PathVariable String id) {
        Article article = articleService.findById(id);
        return ResultGenerator.genSuccessResult(article);
    }

    @ApiOperation(value="列表")
    @GetMapping
    public Result<?> list(@RequestParam(defaultValue = "0") Integer page, 
            @RequestParam(defaultValue = "0") Integer size,
            @RequestParam(defaultValue = "") @ApiParam(required = false) String searchString) {
        PageHelper.startPage(page, size);
        Condition condition = new Condition(Article.class);

        Condition.Criteria baseCondition = condition.createCriteria();
        baseCondition.andCondition("is_deleted=", false);

        if (!StringUtils.isBlank(searchString)) {
            Condition.Criteria searchCondition = condition.createCriteria();
            condition.and(searchCondition);
        }

        List<Article> list = articleService.findByCondition(condition);
        PageInfo<?> pageInfo = new PageInfo<Article>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
