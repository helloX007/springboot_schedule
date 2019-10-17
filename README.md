# springboot_schedule
基于springboot应用，实现schedule定时任务:
  静态定时任务：@Schedule注解cron参数写死；
  动态定时任务：将cron参数配置到数据库表中，从数据库获取定时参数，动态执行定时任务。

  集成了mybatis,实现数据库简单的增删改查
