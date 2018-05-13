package org.com.kashmir.config;

import org.com.kashmir.scheduler.ScheduledFooTasks;
import org.com.kashmir.scheduler.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SchedulerConfig {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	
	@Autowired
	private Environment env;

	@Bean
	public ScheduledFooTasks testePog() {
		
		String cronConfigurado = env.getProperty( "scheduler.taks.foo.cron" );
		
		if ( cronConfigurado == null || "".equals(cronConfigurado)  ) {
			throw new RuntimeException("Não foi encontrado um valor para o config 'scheduler.taks.foo.cron' nas variáveis de ambiente." );
		}
		
		log.info( "Scheduler [ScheduledFooTasks] configurado com o cron: {}", cronConfigurado );
		
		return new ScheduledFooTasks();
	}
	
}
