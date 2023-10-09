package com.example.SchoolMagement.model;

public class LoginResponse {
    private Student student;
    private Bankaccount bankAccount;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Bankaccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(Bankaccount bankAccount) {
		this.bankAccount = bankAccount;
	}

     
}