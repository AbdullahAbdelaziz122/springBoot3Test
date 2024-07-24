package com.example.trySpringBoot;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
	
	
	private final StudentRepository repository;
	
	
	
	
	public firstController(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	
	


	@PostMapping("/students")
	public Student post (@RequestBody Student student) {
		
		return repository.save(student);
	}
	
	@GetMapping("/students")
	public List<Student> findAllStudents() {
		return repository.findAll();
	}
	
	@GetMapping("/students/{student-id}")
	public Student findStudentById(
			@PathVariable("student-id") Integer id) {
		return repository.findById(id).orElse(new Student());
	}
	
	@GetMapping("/students/search/{student-name}")
	public List<Student> findStudentByName(
			@PathVariable("student-name") String name) {
		return repository.findAllStudentsByFirstnameContaining(name);
	}
	
	@DeleteMapping("/students/{student-id}")
	@ResponseStatus(HttpStatus.OK)
	public String delete(@PathVariable("student-id") Integer id) {
		repository.deleteById(id);
		return "Student "+id+ " Successfully Deleted";
	}
	
	
	
}
