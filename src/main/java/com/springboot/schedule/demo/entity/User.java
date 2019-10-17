package com.springboot.schedule.demo.entity;

import com.springboot.schedule.demo.uitls.DateUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private String gender;
    private Date create_time;
    private Date update_time;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", createTime=" + DateUtil.getTime(create_time,"yyyy-MM-dd HH:mm:ss") +
                ", updateTime=" + DateUtil.getTime(update_time,"yyyy-MM-dd HH:mm:ss") +
                '}';
    }
}
