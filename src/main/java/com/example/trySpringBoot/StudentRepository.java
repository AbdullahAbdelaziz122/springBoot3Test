package com.example.trySpringBoot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findAllStudentsByFirstnameContaining(String Firstname);
}
