package com.programme;

public class Student {
	private String name;
	private int age;
	private double salary;
	private String city;
	private String emailid;
	public Student(String name, int age, double d, String city, String emailid) {
		super();
		this.name = name;
		this.age = age;
		this.salary = d;
		this.city = city;
		this.emailid = emailid;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", salary=" + salary + ", city=" + city + ", emailid="
				+ emailid + "]";
	}
	
	
	
	
}