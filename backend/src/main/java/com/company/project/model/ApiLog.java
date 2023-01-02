package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "api_log")
public class ApiLog {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 请求时间
     */
    @Column(name = "request_time")
    private Date requestTime;

    /**
     * 发起用户
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 处理方法
     */
    private String handle;

    /**
     * 执行情况标志
     */
    private Integer status;

    /**
     * 响应时间
     */
    @Column(name = "response_time")
    private Date responseTime;

    private String ip;

    @Column(name = "from_client")
    private String fromClient;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 响应结果
     */
    private String response;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取请求方法
     *
     * @return method - 请求方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置请求方法
     *
     * @param method 请求方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取请求地址
     *
     * @return url - 请求地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求地址
     *
     * @param url 请求地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取请求时间
     *
     * @return request_time - 请求时间
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * 设置请求时间
     *
     * @param requestTime 请求时间
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * 获取发起用户
     *
     * @return user_id - 发起用户
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置发起用户
     *
     * @param userId 发起用户
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取处理方法
     *
     * @return handle - 处理方法
     */
    public String getHandle() {
        return handle;
    }

    /**
     * 设置处理方法
     *
     * @param handle 处理方法
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * 获取执行情况标志
     *
     * @return status - 执行情况标志
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置执行情况标志
     *
     * @param status 执行情况标志
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取响应时间
     *
     * @return response_time - 响应时间
     */
    public Date getResponseTime() {
        return responseTime;
    }

    /**
     * 设置响应时间
     *
     * @param responseTime 响应时间
     */
    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return from_client
     */
    public String getFromClient() {
        return fromClient;
    }

    /**
     * @param fromClient
     */
    public void setFromClient(String fromClient) {
        this.fromClient = fromClient;
    }

    /**
     * 获取请求参数
     *
     * @return params - 请求参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置请求参数
     *
     * @param params 请求参数
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 获取响应结果
     *
     * @return response - 响应结果
     */
    public String getResponse() {
        return response;
    }

    /**
     * 设置响应结果
     *
     * @param response 响应结果
     */
    public void setResponse(String response) {
        this.response = response;
    }
}