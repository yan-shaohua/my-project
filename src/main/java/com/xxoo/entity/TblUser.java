package com.xxoo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@TableName("xxx_org.tbl_user")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TblUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    // 姓名
    private String name;

    // 手机
    private String phone;

    // 邮箱
    private String email;

    // 专业
    private String profession;

    // 年龄
    private Integer age;

    // 性别 , 1: 男, 2: 女
    private Integer gender;

    // 状态
    private Integer status;

    // 创建时间
    private String createtime;

}
