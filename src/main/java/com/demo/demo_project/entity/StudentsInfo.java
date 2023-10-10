package com.demo.demo_project.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Component;

import com.demo.demo_project.interactions.StudentRequest;

@Entity
@Table(name = "my_user")
public class StudentsInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name,surname;
private int age;
private String email;

@OneToOne
@JoinColumn(name="address_id")
private Address address;

@OneToMany(mappedBy="student")
private List<Subjects>subjects;

public List<Subjects> getSubjects() {
	return subjects;
}


public StudentsInfo(long id ,String name, String surname, int age, String email) {
	super();
	this.id=id;
	this.name = name;
	this.surname = surname;
	this.age = age;
	this.email = email;

}


@Override
public String toString() {
	return "StudentsInfo [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email
			+ "]";
}


public StudentsInfo() {
	// TODO Auto-generated constructor stub
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
public StudentsInfo(StudentRequest request) {
	this.id=request.getId() ;
	this.name =request.getName();
	this.surname = request.getSurname();
	this.age =request.getAge();
	this.email = request.getEmail();
	
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


public void setSubjects(List<Subjects> subjects) {
	this.subjects = subjects;
}



	
}



