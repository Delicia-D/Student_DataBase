package com.demo.demo_project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.demo.demo_project.entity.Address;
import com.demo.demo_project.entity.StudentsInfo;
import com.demo.demo_project.entity.Subjects;
import com.demo.demo_project.interactions.InQueryRequest;
import com.demo.demo_project.interactions.StudentRequest;
import com.demo.demo_project.interactions.SubjectRequest;
import com.demo.demo_project.repository.AddressRepository;
import com.demo.demo_project.repository.StudentinfoRepository;
import com.demo.demo_project.repository.SubjectRepository;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	StudentinfoRepository InfoRepo;
	@Autowired
	AddressRepository AddressRepo;
	@Autowired 
	SubjectRepository subjectRepo;
	
public List<StudentsInfo> getAllStudentsInfo(){
	Sort sort =Sort.by(Sort.Direction.ASC,"name","surname");
	return InfoRepo.findAll(sort);
}
public StudentsInfo createStudentsInfo(StudentRequest request) {
	Address address=new Address();
	address.setStreet(request.getStreet());
	address.setCity(request.getCity());
   address=AddressRepo.saveAndFlush(address);
	 
	StudentsInfo student=new StudentsInfo(request);
	
	student.setAddress(address);
	student=InfoRepo.save(student);
	
	List<Subjects>subjectList=new ArrayList<Subjects>();
	if (request.getSubjects()!=null) {
		for(Subjects request1 :request.getSubjects()) {
			Subjects subject=new Subjects();
			subject.setSubjectName(request1.getSubjectName());
			subject.setMarksObtained(request1.getMarksObtained());
			subject.setStudent(student);
			subjectList.add(subject);
		}
		subjectRepo.saveAll(subjectList);
	}
	student.setSubjects(subjectList);
	
	return student;
}
public List<StudentsInfo>getByName(String name){
	return InfoRepo.findByName(name);
}
public List<StudentsInfo>getByNameandSurname(String name){
	return InfoRepo.findByName(name);
}
public List<StudentsInfo>getByNameIn(InQueryRequest inQueryRequest){
	return InfoRepo.findByNameIn(inQueryRequest.getNames());
}
public List<StudentsInfo>getByCity(String city){
	return InfoRepo.findByAddressCity(city);
}
}
/*public StudentsInfo createStudent(StudentsInfo student) {
	StudentsInfo student1 =InfoRepo.save(student);
	return student1;
	
}
*/


