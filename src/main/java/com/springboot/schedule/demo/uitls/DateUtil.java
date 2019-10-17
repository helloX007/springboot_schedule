package com.springboot.schedule.demo.uitls;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//
//        System.out.println(getTime(date,"yyyy-MM-dd HH:mm:ss"));
//        System.out.println(getTime(date,"yyyy-MM-dd"));
//        System.out.println(getTime(date,"yyyyMMddHHmmss"));
//        System.out.println(getTime(date,"yyyy年MM月dd日 HH时mm分ss秒"));
//    }

    /**
     *
     * @param date
     * @param  pattern  时间字符串格式
     * @return  yyyy-MM-dd HH:mm:ss 格式时间字符串
     */
    public static String getTime(Date date,String pattern){
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }
}
