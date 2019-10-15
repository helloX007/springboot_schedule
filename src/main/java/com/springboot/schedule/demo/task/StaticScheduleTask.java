package com.springboot.schedule.demo.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Configuration
@EnableScheduling
public class StaticScheduleTask {

    /*[秒] [分] [小时24] [日] [月] [周] [年] */

    /**
     * *表示所有值。 例如:在分的字段上设置 *,表示每一分钟都会触发。
     * ? 表示不指定值  月 年 适用
     * -表示区间
     * , 表示指定多个值
     * / 用于递增触发
     * L 表示最后的意思  6L 这样的格式,则表示“本月最后一个星期五”   月 周 适用
     * W 表示离指定日期的最近那个工作日(周一至周五)  15W，表示离每月15号最近的那个工作日   周 适用
     * #序号(表示每月的第几个周几)，例如在周字段上设置”6#3”表示在每月的第三个周六        周 适用
     */
    @Async
    @Scheduled(cron = "* * * * * *")  /* 每分钟的第3秒执行一次*/
    public void ScheduleTask1(){
        System.out.println("静态定时任务执行-----："+new Date());

    }

    @Async
    @Scheduled(fixedDelay = 1000L) /* 应用启动启动立马执行，然后 每隔10秒执行一次 */
    public void ScheduleTask2(){
        System.out.println("延时定时任务执行："+new Date());

    }

    @Async
    @Scheduled(fixedDelay = 1000L) /* 应用启动启动立马执行，然后 每隔10秒执行一次 */
    public void ScheduleTask3(){
        System.out.println("延时定时任务执行**："+new Date());

    }

}
