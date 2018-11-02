package com.huizhi.entity;

public class Students {
	private int xh;
	private String name;
	private int age;
	private String sex;
	private String add;
	private String date;
	private String tel;
	private int gid;
	private int state;
	public int getXh() {
		return xh;
	}
	public void setXh(int xh) {
		this.xh = xh;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Students(int xh, String name, int age, String sex, String add, String date, String tel, int gid, int state) {
		
		this.xh = xh;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.add = add;
		this.date = date;
		this.tel = tel;
		this.gid = gid;
		this.state = state;
	}
	public Students() {
		
	}
	
}
