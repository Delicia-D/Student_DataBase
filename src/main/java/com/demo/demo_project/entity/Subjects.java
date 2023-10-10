package com.demo.demo_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table  (name="Subject")
public class Subjects {
@Column(name="marksObtained")
private long marksObtained;

 private String subjectName;
 
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private long id;
 


@ManyToOne
 @JoinColumn(name="student_id ")
 private StudentsInfo student;

public Subjects() {
	super();
	// TODO Auto-generated constructor stub
}

public Subjects(long marksObtained, String subjectName, long id) {
	super();
	this.marksObtained = marksObtained;
	this.subjectName = subjectName;
	this.id = id;
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

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public StudentsInfo getStudent() {
	return student;
}

public void setStudent(StudentsInfo student) {
	this.student = student;
}
 
}
