package com.springboot.schedule.demo.service;

import com.springboot.schedule.demo.dao.UserDao;
import com.springboot.schedule.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> selectAll(){
        return userDao.selectAll();
    }

    public void insertOnt(String name,String gender){
        userDao.insertOne(name,gender);
    }
}
