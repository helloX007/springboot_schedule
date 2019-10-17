package com.springboot.schedule.demo.controller;

import com.springboot.schedule.demo.entity.User;
import com.springboot.schedule.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/all")
    public List<User> selectAll(){
        List<User> lu = userService.selectAll();
        lu.forEach(e -> System.out.println(e));
        return lu;
    }


    @RequestMapping("/insertOne")
    public String insertOne(@Param("name")String name,@Param("gender")String gender){/*表单提交适用@Param, json格式还是适用@RequestBody*/
        userService.insertOnt(name,gender);
        return "sucessfull!";
    }
}
