package com.jslhrd.bbb;
public class User {
	private String id;
	private String name;
	private int age;
	public User() {}
	public User(String id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User user = (User)obj;
			return user.id.equals(id);
		}else {
			return false;
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
