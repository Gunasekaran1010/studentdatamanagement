package com.example.SchoolMagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SchoolMagement.model.Bankaccount;
import com.example.SchoolMagement.repositery.Studentbankacoount;

@Service
public class Studentaccountdertails {
	
	@Autowired
	public Studentbankacoount stubankk;
	
	
	public List<Bankaccount> getallbankdetails(){
		return stubankk.findAll();
	}
	

}
