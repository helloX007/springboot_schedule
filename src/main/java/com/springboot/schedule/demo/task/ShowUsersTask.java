package com.springboot.schedule.demo.task;

import com.springboot.schedule.demo.dao.UserDao;
import com.springboot.schedule.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configuration
//@EnableScheduling
public class ShowUsersTask {

    @Autowired
    UserDao userDao;

    @Scheduled(cron = "0/10 * * * * *")  /* 每分钟的第3秒执行一次*/
    public void showUsers(){
        List<User> users = userDao.selectAll();
        System.out.println(users);
    }
}
