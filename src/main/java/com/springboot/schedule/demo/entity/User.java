package com.springboot.schedule.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private int id;
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
                ", createTime=" + create_time +
                ", updateTime=" + update_time +
                '}';
    }
}
