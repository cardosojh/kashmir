package org.com.kashmir.initialization;

import org.com.kashmir.service.ApplictionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class KashmirAppInitialization implements ApplicationListener<ApplicationReadyEvent> {

	private static final Logger log = LoggerFactory.getLogger(KashmirAppInitialization.class);
	
	@Autowired
	private ApplictionService applictionService; 
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent arg0) {
		log.info("### KashmirAppInitialization ###");
		log.info("The time is now {}", applictionService.getCurrentTime());
	}

}