//package com.senac.api.schedulers.test;
//
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TriggerTestBuild {
//    @Bean
//    public JobDetail jobCaldeirao() {
//        return JobBuilder.newJob(JobCaldeirao.class)
//                .withIdentity("lucianoHulk","caldeiraoDoHulk")
//                .storeDurably().build();
//    }
//    @Bean
//    public Trigger triggerCaldeirao(){
//        return TriggerBuilder.newTrigger()
//                .withIdentity("luciaoHulk","caldeiraoDoHulk")
//                .forJob(this.jobCaldeirao())
//                .withSchedule(CronScheduleBuilder.cronSchedule("1,3,5,7,9,11,13,15,17,19,21 * * ? * * *"))
//                .build();
//    }
//    @Bean
//    public JobDetail jobDomingao() {
//        return JobBuilder.newJob(JobDomingao.class)
//                .withIdentity("faustao","domingaoDoFaustao")
//                .storeDurably().build();
//    }
//    @Bean
//    public Trigger triggerDomingao(){
//        return TriggerBuilder.newTrigger()
//                .withIdentity("faustao","domingaoDoFaustao")
//                .forJob(this.jobDomingao())
//                .withSchedule(CronScheduleBuilder.cronSchedule("0,2,4,6,8,10,12,14,16,18,20 * * ? * * *"))
//                .build();
//    }
//}
