package org.com.kashmir.scheduler;

import org.com.kashmir.service.ApplictionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	@Autowired
    private ApplictionService applictionService;

    @Scheduled(cron = "${scheduler.taks.cron}")
    public void reportCurrentTime() {
    	log.info("The time is now {}", applictionService.getCurrentTime());
    }
	
}