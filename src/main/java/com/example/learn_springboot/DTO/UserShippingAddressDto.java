package com.example.learn_springboot.DTO;

import com.example.learn_springboot.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class UserShippingAddressDto extends User {
    private static final long serialVersionUID = 1L;
    private String address;
    private String def;
}
