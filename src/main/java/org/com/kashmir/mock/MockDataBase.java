package org.com.kashmir.mock;

import java.util.List;

import org.com.kashmir.model.User;

public class MockDataBase {

	public static List<User> getUsers() {
		return MockUser.getInstance().getUsers();
	}
	
}