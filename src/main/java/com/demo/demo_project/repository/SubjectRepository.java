package com.demo.demo_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo_project.entity.Subjects;

public interface SubjectRepository extends JpaRepository<Subjects, Long>{

}
