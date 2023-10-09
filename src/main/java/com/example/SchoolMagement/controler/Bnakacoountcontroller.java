package com.example.SchoolMagement.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SchoolMagement.model.Bankaccount;
import com.example.SchoolMagement.service.Studentaccountdertails;

@RestController
public class Bnakacoountcontroller {
	@Autowired	
	public Studentaccountdertails studet;
	
	@GetMapping("/getacc")
	public List<Bankaccount> getalldataacoount(){
		return  studet.getallbankdetails();
	}
}
