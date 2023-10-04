package com.example.SchoolMagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SchoolMagement.model.Student;
import com.example.SchoolMagement.repositery.StudentInfo;

@Service
public class Servicces {
	
	@Autowired
	public StudentInfo stuinfo;
	
	
	public List<Student> returnstudata(){
		
		System.out.println(stuinfo.findAll());
		
		return stuinfo.findAll();
		
	}


	public Student addstudent(@RequestBody Student stu) {
		
		Optional<Student> emp = stuinfo.findById(stu.getId());
		Student stu2 = null;
		
		if(emp.isPresent()) {
			
			stu2 = stuinfo.save(stu);
			System.out.print("Is present");
			
		}else {
			stu2 = stuinfo.save(stu);
			System.out.print("Is not present");
		}
		
		return stu2;
	}
	
	public void deleteidstu(Integer ids) {
		 stuinfo.deleteById(ids);
	}
	
	public List<Student> findStudentsOlderThan(int age) {
	    return stuinfo.findByAgeGreaterThan(age);
	}



}
