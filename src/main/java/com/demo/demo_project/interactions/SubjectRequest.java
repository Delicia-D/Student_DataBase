package com.demo.demo_project.interactions;

public class SubjectRequest {
private String subjectName;
private long marksOtained;

public SubjectRequest() {
	super();
	// TODO Auto-generated constructor stub
}
public SubjectRequest(String subjectName, long marksOtained) {
	super();
	this.subjectName = subjectName;
	this.marksOtained = marksOtained;
}
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}
public long getMarksOtained() {
	return marksOtained;
}
public void setMarksOtained(long marksOtained) {
	this.marksOtained = marksOtained;
}

}
