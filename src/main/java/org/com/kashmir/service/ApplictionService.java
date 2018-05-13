package org.com.kashmir.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class ApplictionService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	public String getCurrentTime() {
		return dateFormat.format(new Date());
	}
	
}