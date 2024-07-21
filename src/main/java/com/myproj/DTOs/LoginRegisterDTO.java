package com.myproj.DTOs;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component("logindto")
public class LoginRegisterDTO implements Serializable{
	private int personid;
	private String  Fname;
	private String LastName;
	private String  Address;
	private String city;
	private String Email;
	private String password;
	private String Gender;
	private Long contactno;		
	private String username;
	private boolean flag;
	private String  role;
	
	

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getOntactno() {
		return contactno;
	}
	public void setOntactno(Long ontactno) {
		this.contactno = ontactno;
	}
	@Override
	public String toString() {
		return "loginRegiDto [personid=" + personid + ", Fname=" + Fname + ", LastName=" + LastName + ", Address="
				+ Address + ", city=" + city + ", Email=" + Email + ", password=" + password + ", Gender=" + Gender
				+ ", ontactno=" + contactno + ", username=" + username + ", flag=" + flag + ", Contact=" + Contact
				+ ", isFlag()=" + isFlag() + ", getUsername()=" + getUsername() + ", getOntactno()=" + getOntactno()
				+ ", getPersonid()=" + getPersonid() + ", getFname()=" + getFname() + ", getLastName()="
				+ getLastName() + ", getAddress()=" + getAddress() + ", getCity()=" + getCity() + ", getEmail()="
				+ getEmail() + ", getPassword()=" + getPassword() + ", getGender()=" + getGender()
				+ ", getContact()=" + getContact() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private Long Contact;
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Long getContact() {
		return Contact;
	}
	public void setContact(Long contact) {
		Contact = contact;
	}
public void show() {
	System.out.println("component  as class  bean ");
}  
}


