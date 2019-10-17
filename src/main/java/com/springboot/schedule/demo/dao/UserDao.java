package com.springboot.schedule.demo.dao;

import com.springboot.schedule.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
//@Repository
public interface UserDao {

    /* sql 可以写这里 也可以写到xml配置文件中 ，写到配置文件中需要配置对应的加载参数*/
//    @Select("select * from user")
    public List<User> selectAll();

    public void insertOne(@Param("name") String name, @Param("gender") String gender);

}
