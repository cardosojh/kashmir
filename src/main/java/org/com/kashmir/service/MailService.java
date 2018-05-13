package org.com.kashmir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired 
	private JavaMailSender mailSender;
	
	public String send() {
	
		SimpleMailMessage message = new SimpleMailMessage();
	
	    message.setText("Hello from Spring Boot Application");
	    message.setTo("henriquejhc@gmail.com");
	    message.setFrom("henriquejhc@gmail.com");
	
	    try {
	        mailSender.send(message);
	        return "Email enviado com sucesso!";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Erro ao enviar email.";
	    }
	}
}
