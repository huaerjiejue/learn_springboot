package com.example.learn_springboot.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.learn_springboot.entity.User;
import com.example.learn_springboot.mapper.UserMapper;
import com.example.learn_springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
