package com.example.loan.service;

import java.util.List;
import java.util.Optional;

import com.example.loan.entity.Registration;

public interface RegitrationService {
	
	 public void saveData(Registration registration);
	 public List<Registration> getAllData();	 
	 public Optional<Registration> getById(int id);
	 

}
