package com.senac.api.schedulers.emailTrigger;

import org.quartz.*;
import org.springframework.context.annotation.Bean;

public class TriggerEmailTriggerBuild {
    @Bean
    public JobDetail jobEmailTrigger() {
        return JobBuilder.newJob(JobEmailTrigger.class)
                .withIdentity("emailTrigger","emailTrigger")
                .storeDurably().build();
    }
    @Bean
    public Trigger triggerEmailTrigger(){
        return TriggerBuilder.newTrigger()
                .withIdentity("emailTrigger","emailTrigger")
                .forJob(this.jobEmailTrigger())
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 0 * * ? * * *"))
                .build();
    }
}