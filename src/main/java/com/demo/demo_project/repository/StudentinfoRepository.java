package com.demo.demo_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo_project.entity.Address;
import com.demo.demo_project.entity.StudentsInfo;

@Repository
public interface StudentinfoRepository extends JpaRepository<StudentsInfo,Long> {
  List<StudentsInfo>findByName(String name);
  StudentsInfo findBynameAndSurname(String name, String Surname);
 // List<StudentsInfo>findByNameorSurname(String name, String Surname);
  List<StudentsInfo>findByNameIn(List<String>names);
  
  List<StudentsInfo>findByAddressCity(String address);
  
}
