package com.company.project.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result<?> genSuccessResult() {
        return new Result<>().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    @SuppressWarnings("all")
    public static <T> Result<T> genSuccessResult(T data) {
        return new Result().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE).setData(data);
    }

    public static Result<?> genFailResult(String message) {
        return new Result<>().setCode(ResultCode.FAIL).setMessage(message);
    }

    public static Result<?> genUnAuthorizedResult(String message) {
        return new Result<>().setCode(ResultCode.UNAUTHORIZED).setMessage(message);
    }

    public static Result<?> genForbiddenResult(String message){
        return new Result<>().setCode(ResultCode.FORBIDDEN).setMessage(message);
    }
}
