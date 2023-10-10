package com.demo.demo_project.api;

import java.util.List;

import org.slf4j.LoggerFactory;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo_project.entity.Address;
import com.demo.demo_project.entity.StudentsInfo;
import com.demo.demo_project.interactions.InQueryRequest;
import com.demo.demo_project.interactions.StudentRequest;
import com.demo.demo_project.repository.AddressRepository;
import com.demo.demo_project.repository.StudentinfoRepository;

import com.demo.demo_project.service.Service;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin

@RequestMapping("/api/StudentInfo")
public class homeController {
	
	
	org.slf4j.Logger logger=LoggerFactory.getLogger(homeController.class);
	
	@Autowired
	StudentinfoRepository InfoRepo1;
	@Autowired
	
	Service InfoService;
	
	@GetMapping("/getInfo" )
	public List<StudentsInfo>getAllStudentsInfo(){
		logger.error("Inside error");
		logger.info("Inside info");
		logger.trace("Inside trace");
		logger.warn("Inside warnings");
		logger.debug("Inside debug");
		return InfoService.getAllStudentsInfo();
	}
	
	@GetMapping("/getByName/{name}" )
	public List<StudentsInfo>getByName(@PathVariable String name){
		return InfoService.getByName(name );
	}
	@GetMapping("/getByNameIn")
	public List<StudentsInfo>getByNameIn(@RequestBody  InQueryRequest Inquery){
		//logger.info(Inquery.toString());
		
		 List<StudentsInfo>Studentlist=InfoService.getByNameIn(Inquery);
		 logger.info(Studentlist.toString());
		 return Studentlist;
		
	}
	@GetMapping("/getByCity/{city}")
	public List<StudentsInfo>getByCity(@PathVariable String city){
		List<StudentsInfo>studentsList=InfoService.getByCity(city);
		return studentsList;
	}
	@Autowired 
	AddressRepository AddressRepo;
	@PostMapping("/create")
	public String createStudent(@RequestBody StudentRequest student) {
		StudentsInfo studentcreate=InfoService.createStudentsInfo(student);
		
		return "Student successfully added to database";
	}
	@PutMapping("/updateName")
	public String updateStudent(@RequestBody StudentsInfo students) {
	
		StudentsInfo Studentupdated=InfoRepo1.findById(students.getId()).get();
				if (students.getName()!=null) {
					students.setName(Studentupdated.getName());
				
		InfoRepo1.save(students);
				}
		return "updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeleteStudent(@PathVariable long id) {
		 InfoRepo1.deleteById(id);
		 return "Student info successfully deleted";
	}

	


}
