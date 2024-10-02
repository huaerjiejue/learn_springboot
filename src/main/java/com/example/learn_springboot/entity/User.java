package com.example.learn_springboot.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@TableName(value = "t_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String sex;
    private String phone;
}
