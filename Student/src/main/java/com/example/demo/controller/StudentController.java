package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/GetStudent")
	public List<Student>getAllStudent()
	{
		return service.getAllStudent();
	}

	@PostMapping("/AddStudent")
	public void addStudent(@RequestBody Student stu)
	{
		service.addStudent(stu);
	}

	@PostMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable String id)
	{
		service.deleteStudent(id);
	}

	@GetMapping("/GetStudent1/{id}")
	public Optional<Student> getAllStudent(@PathVariable String id)
	{
		return service.findById(id);
	}

	@PostMapping("/updateStudent/{id}")
	public void updateStudents(@PathVariable String id, @RequestBody Student stu)
	{
		service.updateStudent(stu,id);
	}

}

