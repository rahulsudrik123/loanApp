package com.example.loan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.entity.Registration;
import com.example.loan.repository.RegitrationRepo;
import com.example.loan.service.RegitrationService;

@Service
public class RegitrationServiceImpl  implements RegitrationService{
	
	@Autowired
	RegitrationRepo registrationRepo;
	public void saveData(Registration registration) {
		
		registrationRepo.save(registration);
		
	}
	
	public List<Registration> getAllData(){
		return registrationRepo.findAll();
	}
	
	public Optional<Registration> getById(int id){
		return registrationRepo.findById(id);
			
	}

}
