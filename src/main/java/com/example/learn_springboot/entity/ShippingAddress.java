package com.example.learn_springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "t_shipping_address")
public class ShippingAddress {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer user_id;
    private String address;
    private String is_default;
}
