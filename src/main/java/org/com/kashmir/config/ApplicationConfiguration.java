package org.com.kashmir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApplicationConfiguration {

	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new CorsConfiguration();
    }
	
}
