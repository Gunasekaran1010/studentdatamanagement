package com.example.SchoolMagement.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SchoolMagement.model.Student;

import com.example.SchoolMagement.service.Servicces;

@RestController
public class Controler {
	
	@Autowired
	public Servicces survice;
	
	
	@GetMapping("/get")
	public String getnewvalues() {
		return "Guna";
	}
	
	@GetMapping("/data")
	public List<Student> getsutudentdata(){
		
		return survice.returnstudata();
		
	}
	
	@PostMapping("/post")
	public Student poststudentdata(@RequestBody Student stu) {
		return survice.addstudent(stu);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletestu(@PathVariable("id") Integer stuid) {
		
		 survice.deleteidstu(stuid);
		
	}
	
	@GetMapping("/studentsOlderThan/{age}")
	public List<Student> getStudentsOlderThan(@PathVariable("age") int age) {
	    return survice.findStudentsOlderThan(age);
	}




	

}
