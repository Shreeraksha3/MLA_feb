package com.test.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.test.entity.Student;
import com.test.service.StudentSevice;

@RestController
public class StudentController {
	protected  Logger logger = Logger.getLogger(StudentController.class.getName());
	@Autowired
	private StudentSevice service;
	
	public Student createStudent(@RequestBody Student std)
	{
		return service.addStudent(std);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, Student std)
	{
		std.setId(id);
		return service.updateStudent(std);
	}
	
	public Student getStudentById(@PathVariable int id)
	{
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Student> deleteStudentById(@PathVariable int id)
	{
		return service.deleteStudentById(id);
	}
	
	@GetMapping("/list")
	public List<Student> getAllStudents()
	{
		return service.listAllStudents();
	}
	

}

