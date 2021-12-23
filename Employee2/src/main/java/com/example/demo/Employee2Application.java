package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Employee2Application implements CommandLineRunner{



public static void main(String[] args) {
SpringApplication.run(Employee2Application.class, args);
}
@Autowired
EmployeeRepository repository;

@Override
public void run(String... args)throws Exception
{
this.repository.save(new Employee("ss","d1","dd","dsd"));
this.repository.save(new Employee("ss","d12","dd","dsd"));
this.repository.save(new Employee("ss","d13","dd","dsd"));
}



}
