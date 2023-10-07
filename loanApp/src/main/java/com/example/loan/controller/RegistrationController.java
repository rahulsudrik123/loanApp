package com.example.loan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.entity.Registration;
import com.example.loan.service.RegitrationService;

@RestController

public class RegistrationController {
	@Autowired
	RegitrationService registrationService;
	
	@GetMapping("/getAllData")
	public List<Registration>getAllData(){
		return registrationService.getAllData();
		
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Registration>getById(@PathVariable int id){
		return registrationService.getById(id);
	}
	@PostMapping("/saveData")
	public void saveData(@RequestBody Registration registration) {
		registrationService.saveData(registration);
	}

}
