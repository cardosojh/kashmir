package org.com.kashmir.mock;

import java.util.ArrayList;
import java.util.List;

import org.com.kashmir.model.User;

public class MockUser {

	private static MockUser instance;
	
	private List<User> list;
	
	private MockUser() {
		init();
	}
	
	public static MockUser getInstance() {
		
		if (instance == null) {
			instance = new MockUser();
		}
		
		return instance;
	}
	
	public List<User> getUsers() {
		return list;
	}
	
	private void init() {
		this.list = new ArrayList<User>();
		this.list.add(new User(1l, "Ana", "ana@email.com"));
		this.list.add(new User(2l, "Pedro", "pedro@email.com"));
		this.list.add(new User(3l, "Maria", "maria@email.com"));
		this.list.add(new User(4l, "João", "joao@email.com"));
	}
}