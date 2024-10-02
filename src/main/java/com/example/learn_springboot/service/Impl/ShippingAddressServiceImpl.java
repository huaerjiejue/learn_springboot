package com.example.learn_springboot.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.learn_springboot.entity.ShippingAddress;
import com.example.learn_springboot.mapper.ShippingAddressMapper;
import com.example.learn_springboot.service.ShippingAddressService;
import org.springframework.stereotype.Service;

@Service
public class ShippingAddressServiceImpl extends ServiceImpl<ShippingAddressMapper, ShippingAddress> implements ShippingAddressService {
}
