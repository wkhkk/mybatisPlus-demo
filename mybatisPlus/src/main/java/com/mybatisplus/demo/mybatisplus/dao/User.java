package com.mybatisplus.demo.mybatisplus.dao;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 用户表
    */
@Data
@TableName("user")
public class User {
    /**
    * 主键
    */
    private Long id;

    /**
    * 唯一标识
    */
    private String uuid;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 用户名唯一标识
    */
    private String userNameUuid;

    /**
    * 微信号
    */
    private String weChatName;

    /**
    * 手机号
    */
    private String phoneNumber;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 创建时间
    */
    private Date createdAt;

    /**
    * 修改时间
    */
    private Date updatedAt;

    /**
    * 创建人uuid
    */
    private String createdBy;

    /**
    * 修改人uuid
    */
    private String updatedBy;

    /**
    * 是否删除：0-未删除，1-已删除
    */
    private Integer isDeleted;
}