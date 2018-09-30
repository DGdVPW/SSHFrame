package com.ssh.domain;

public class User {
	public String id;
	public String name;
	public String sex;
	public int age;
	public String tel;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public User() {
		
	}
	public User(String id, String name, String sex, int age, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
	}
	

}
