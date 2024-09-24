package io;

import java.io.Serializable;

public class FriendVO implements Serializable{
	private static final long serialVersionUID = 1L;     // static 있으면 instance가 아니라 우리의 멤버가 아님
	// 멤버필드
	private String name;
	private String phone;
	private int age;
	
	// 기본 생성자 - 이유 불문 무조건 넣어야 함
	// 생성자
	public FriendVO() {
		super();
	}
	
	// 오버로딩 생성자
	public FriendVO(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 일반 메소드
	public void output() {
		System.out.printf("%3s %15s %3d%n", name, phone, age);
	
	
}
}

