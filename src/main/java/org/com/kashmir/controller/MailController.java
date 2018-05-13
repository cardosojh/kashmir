package org.com.kashmir.controller;

import org.com.kashmir.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	private MailService mailService;
	
	@RequestMapping(path = "/send", method = RequestMethod.GET)
	public String send() {
		return mailService.send();
	}
	
}