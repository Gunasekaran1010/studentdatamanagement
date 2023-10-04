package com.example.SchoolMagement.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SchoolMagement.model.Student;

public interface StudentInfo extends JpaRepository<Student, Integer> {
	
    List<Student> findByAgeGreaterThan(int age);
}
