package com.happiestminds.taskscheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class ScheduledTasks {

    /**
     * Scheduling a Task with Fixed Rate
     */

    @Scheduled(fixedRateString = "${fixedRate.in.miliseconds}")
    public void scheduledTaskWithFixedRate() {
        System.out.println("ScheduledTaskWithFixedRate: current time: " + new Date());
    }

    @Scheduled(fixedRate = 1000)
    public void scheduledTaskWithFixedRateAndProcessingTime() throws InterruptedException {
        System.out.println("scheduledTaskWithFixedRateAndProcessingTime: started: " + new Date());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("scheduledTaskWithFixedRateAndProcessingTime: finished: " + new Date());
    }

    /**
     * Scheduling a Task with Fixed Delay
     */

    @Scheduled(fixedDelay = 3000)
    public void scheduledTaskWithFixedDelay() {
        System.out.println("scheduledTaskWithFixedDelay: current time: " + new Date());
    }

    @Scheduled(fixedDelay = 3000)
    public void scheduledTaskWithFixedDelayAndProcessingTime() throws InterruptedException {
        System.out.println("scheduledTaskWithFixedDelayAndProcessingTime: started: " + new Date());
        TimeUnit.SECONDS.sleep(2);
        System.out.println("scheduledTaskWithFixedDelayAndProcessingTime: finished: " + new Date());
    }

    /**
     * Scheduling a Task With Fixed Rate and Initial Delay
     */

    @Scheduled(initialDelay = 5000, fixedRate = 1000)
    public void scheduledTaskWithInitialDelay() {
        System.out.println("scheduledTaskWithInitialDelay: current time: " + new Date());
    }

    /**
     * Scheduling a Task using Cron Expression
     */

    @Scheduled(cron = "${cronValue}")
    public void scheduledTaskWithCronExpression() {
        System.out.println("scheduledTaskWithCronExpression: current time: " + new Date());
    }
}
