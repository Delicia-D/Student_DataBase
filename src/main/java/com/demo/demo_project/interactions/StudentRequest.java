package com.demo.demo_project.interactions;

import java.util.List;

import com.demo.demo_project.entity.Subjects;

public class StudentRequest {
	private long id;
	private String name,surname;
	private int age;
	private String email;
	private String street;
	private String city;
	 private long marksObtained;
	 private String subjectName;
	
	
	public StudentRequest(long id, String name, String surname, int age, String email, String street, String city,long marksObtained,String subjectName) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.street = street;
		this.city = city;
		this.subjectName=subjectName;
		this.marksObtained=marksObtained;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(long marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	private List<Subjects>subjects;
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	public StudentRequest() {
		super();
		// TODO Auto-generated constructor stub
}
}
