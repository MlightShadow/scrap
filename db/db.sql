-- scrap.api_log definition
CREATE TABLE `api_log` (
    `id` varchar(32) NOT NULL COMMENT 'id',
    `method` varchar(10) NOT NULL COMMENT '请求方法',
    `params` text DEFAULT NULL COMMENT '请求参数',
    `url` varchar(1000) NOT NULL COMMENT '请求地址',
    `response` text DEFAULT NULL COMMENT '响应结果',
    `request_time` datetime DEFAULT NULL COMMENT '请求时间',
    `user_id` varchar(32) DEFAULT NULL COMMENT '发起用户',
    `handle` varchar(500) NOT NULL COMMENT '处理方法',
    `status` int(11) NOT NULL DEFAULT 0 COMMENT '执行情况标志',
    `response_time` datetime DEFAULT NULL COMMENT '响应时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '接口访问log';
-- scrap.article definition
CREATE TABLE `article` (
    `id` varchar(32) NOT NULL COMMENT 'id',
    `flag` int(11) NOT NULL DEFAULT 0 COMMENT '信息状态',
    `title` varchar(100) NOT NULL COMMENT '信息标题',
    `content` text DEFAULT NULL COMMENT '信息内容',
    `source` varchar(32) NOT NULL COMMENT '来源',
    `plateform` varchar(32) NOT NULL COMMENT '来源平台',
    `category` varchar(32) NOT NULL COMMENT '类别',
    `ages` varchar(8) NOT NULL COMMENT '时期',
    `resume` varchar(140) NOT NULL COMMENT '概述',
    `url` varchar(100) DEFAULT NULL COMMENT '原文链接',
    `source_description` varchar(140) DEFAULT NULL COMMENT '来源说明',
    `image` varchar(32) DEFAULT NULL,
    `icon` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '信息';
-- scrap.article_attach definition
CREATE TABLE `article_attach` (
    `id` varchar(32) NOT NULL,
    `article_id` varchar(32) NOT NULL,
    `file_id` varchar(32) NOT NULL,
    `name` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '信息附件';
-- scrap.article_log definition
CREATE TABLE `article_log` (
    `id` varchar(32) NOT NULL COMMENT 'id',
    `article_id` varchar(32) DEFAULT NULL COMMENT '信息id',
    `editor_id` varchar(32) DEFAULT NULL COMMENT '编辑者id',
    `edit_time` datetime DEFAULT NULL COMMENT '编辑时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '信息更新日志';
-- scrap.article_tag definition
CREATE TABLE `article_tag` (
    `id` varchar(32) NOT NULL,
    `article_id` varchar(32) DEFAULT NULL,
    `tag_id` varchar(32) DEFAULT NULL,
    `icon` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '信息标签';
-- scrap.dict definition
CREATE TABLE `dict` (
    `id` varchar(32) NOT NULL,
    `type` varchar(32) NOT NULL,
    `name` varchar(140) NOT NULL,
    `icon` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '字典';
-- scrap.sys_user definition
CREATE TABLE `sys_user` (
    `id` varchar(32) NOT NULL,
    `name` varchar(100) DEFAULT NULL,
    `avatar` varchar(100) DEFAULT NULL,
    `passwd` varchar(100) DEFAULT NULL,
    `login_token` varchar(100) DEFAULT NULL,
    `account` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '管理级用户';
-- scrap.tag definition
CREATE TABLE `tag` (
    `id` varchar(32) NOT NULL,
    `name` varchar(100) DEFAULT NULL,
    `icon` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '标签';
-- scrap.upload_file definition
CREATE TABLE `upload_file` (
    `id` varchar(32) NOT NULL,
    `ext` varchar(32) DEFAULT NULL,
    `path` varchar(1000) DEFAULT NULL,
    `alt` varchar(140) DEFAULT NULL,
    `creator` varchar(32) DEFAULT NULL,
    `create_time` datetime DEFAULT NULL,
    `flag` int(11) DEFAULT NULL,
    `origin_name` varchar(100) DEFAULT NULL,
    `name` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '上传文件';
-- scrap.user_token definition
CREATE TABLE `user_token` (
    `id` varchar(32) NOT NULL,
    `user_id` varchar(32) DEFAULT NULL,
    `token` varchar(400) DEFAULT NULL,
    `type` varchar(32) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户token';