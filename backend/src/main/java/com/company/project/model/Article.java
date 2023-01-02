package com.company.project.model;

import javax.persistence.*;

public class Article {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 信息状态
     */
    private Integer flag;

    /**
     * 信息标题
     */
    private String title;

    /**
     * 来源
     */
    private String source;

    /**
     * 来源平台
     */
    private String plateform;

    /**
     * 类别
     */
    private String category;

    /**
     * 时期
     */
    private String ages;

    /**
     * 概述
     */
    private String resume;

    /**
     * 原文链接
     */
    private String url;

    /**
     * 来源说明
     */
    @Column(name = "source_description")
    private String sourceDescription;

    private String image;

    private String icon;

    /**
     * 信息内容
     */
    private String content;

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
     * 获取信息状态
     *
     * @return flag - 信息状态
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置信息状态
     *
     * @param flag 信息状态
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取信息标题
     *
     * @return title - 信息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置信息标题
     *
     * @param title 信息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取来源平台
     *
     * @return plateform - 来源平台
     */
    public String getPlateform() {
        return plateform;
    }

    /**
     * 设置来源平台
     *
     * @param plateform 来源平台
     */
    public void setPlateform(String plateform) {
        this.plateform = plateform;
    }

    /**
     * 获取类别
     *
     * @return category - 类别
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置类别
     *
     * @param category 类别
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取时期
     *
     * @return ages - 时期
     */
    public String getAges() {
        return ages;
    }

    /**
     * 设置时期
     *
     * @param ages 时期
     */
    public void setAges(String ages) {
        this.ages = ages;
    }

    /**
     * 获取概述
     *
     * @return resume - 概述
     */
    public String getResume() {
        return resume;
    }

    /**
     * 设置概述
     *
     * @param resume 概述
     */
    public void setResume(String resume) {
        this.resume = resume;
    }

    /**
     * 获取原文链接
     *
     * @return url - 原文链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置原文链接
     *
     * @param url 原文链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取来源说明
     *
     * @return source_description - 来源说明
     */
    public String getSourceDescription() {
        return sourceDescription;
    }

    /**
     * 设置来源说明
     *
     * @param sourceDescription 来源说明
     */
    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取信息内容
     *
     * @return content - 信息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置信息内容
     *
     * @param content 信息内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}