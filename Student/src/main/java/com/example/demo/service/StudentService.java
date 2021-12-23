package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	public List<Student>getAllStudent()
	{
		return repository.findAll();
	}

	public void addStudent(Student stu)
	{
		repository.save(stu);
	}

	public void deleteStudent(String id)
	{
		repository.deleteById(id);
	}

	public Optional<Student> findById(String id)
	{
		return repository.findById(id);
	}

	public void updateStudent(Student stu,String id)
	{
		repository.getById(id);
		repository.save(stu);
	}


}
