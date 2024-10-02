package com.example.learn_springboot.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.learn_springboot.entity.User;
import com.example.learn_springboot.service.Impl.UserServiceImpl;
import com.example.learn_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String nickname) {
        /**
         * nickname是localhost:8080/hello?nickname=zhagnsan中的nickname，用来接受用户GET过程中传递过来的参数
         * 但是要确保是一样的，nickname要是一样的
         */
        return "hello world" + nickname;
    }

    @RequestMapping(value = "/test_data", method = RequestMethod.GET)
    public List<User> listData() {
        return userService.list(Wrappers.emptyWrapper());
    }


    @RequestMapping(value = "/post1", method = RequestMethod.POST)
    public String post_test() {
        return "POST请求";
    }

    @RequestMapping(value = "/post2", method = RequestMethod.POST)
    public String post_test2(@RequestParam("nickname") String nickname, @RequestParam("phone") String phone) {
        /**
         * POST http://localhost:8080/post2
         * Content-Type: application/x-www-form-urlencoded
         * <p>
         * nickname=zhangsan&phone=123123
         */
        System.out.println(nickname + ": " + phone);
        return "POST带参数请求";
    }

    @RequestMapping(value = "/post3", method = RequestMethod.POST)
    public String post_test3(@RequestBody Map<String, String> map) {
        // 接受json格式内容，需要对json中内容进行解析，不能直接将json中内容直接放到String中
        System.out.println("nickname: " + map.get("nickname"));
        System.out.println("phone: " + map.get("phone"));
        return "POST上传json数据";
    }
}
