package com.example.loan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register")
public class Registration {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "mobileNo")
	private long mobileNo;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "cPassword")
	private String cPassword;
	
	//Getter Setter
	
	public int getID() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword=cPassword;
	}
	
	//toString Method
	
	public String toString() {
		return("Apllicant id"+id+"Mobile no"+mobileNo+"Password"+password+"Confirm Password"+cPassword);
				
	}
}
