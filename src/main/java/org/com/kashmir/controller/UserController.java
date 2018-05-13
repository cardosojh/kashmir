package org.com.kashmir.controller;

import java.util.List;

import org.com.kashmir.mock.MockDataBase;
import org.com.kashmir.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public List<User> list() {
		return MockDataBase.getUsers();
	}
}