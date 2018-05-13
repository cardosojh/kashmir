package org.com.kashmir.scheduler;

import org.com.kashmir.service.ApplictionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledFooTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledFooTasks.class);

	@Autowired
    private ApplictionService applictionService;

    @Scheduled(cron = "${scheduler.taks.foo.cron}")
    public void executeScheduledFooTasks() {
    	log.info("The time is now {}", applictionService.getCurrentTime());
    }
	
}