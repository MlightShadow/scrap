package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "article_log")
public class ArticleLog {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 信息id
     */
    @Column(name = "article_id")
    private String articleId;

    /**
     * 编辑者id
     */
    @Column(name = "editor_id")
    private String editorId;

    /**
     * 编辑时间
     */
    @Column(name = "edit_time")
    private Date editTime;

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
     * 获取信息id
     *
     * @return article_id - 信息id
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 设置信息id
     *
     * @param articleId 信息id
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取编辑者id
     *
     * @return editor_id - 编辑者id
     */
    public String getEditorId() {
        return editorId;
    }

    /**
     * 设置编辑者id
     *
     * @param editorId 编辑者id
     */
    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    /**
     * 获取编辑时间
     *
     * @return edit_time - 编辑时间
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * 设置编辑时间
     *
     * @param editTime 编辑时间
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
}