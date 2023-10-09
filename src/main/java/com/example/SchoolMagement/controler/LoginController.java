package com.example.SchoolMagement.controler;

import java.util.Map;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SchoolMagement.model.Bankaccount;
import com.example.SchoolMagement.model.LoginResponse;
import com.example.SchoolMagement.model.Student;
import com.example.SchoolMagement.model.User;
import com.example.SchoolMagement.repositery.StudentInfo;
import com.example.SchoolMagement.repositery.Studentbankacoount;
import com.example.SchoolMagement.service.UserService;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private StudentInfo studentInfo;
    @Autowired
    private Studentbankacoount stubank;

    
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody Map<String, String> credentials)  {
        String username = credentials.get("username");
        String password = credentials.get("password");
        
        Optional<User> userOptional = userService.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                Optional<Student> student = studentInfo.findById(user.getId().intValue());
                Optional<Bankaccount> bankacc = stubank.findById(user.getId().intValue());
                if (student.isPresent() && bankacc.isPresent()) {
                    LoginResponse response = new LoginResponse();
                    response.setStudent(student.get());
                    response.setBankAccount(bankacc.get());
                    return ResponseEntity.ok(response);
                } else {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
                }
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }
    
    
    
    
    }

