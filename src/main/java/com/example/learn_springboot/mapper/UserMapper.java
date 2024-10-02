package com.example.learn_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.learn_springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface UserMapper extends BaseMapper<User> {
}
