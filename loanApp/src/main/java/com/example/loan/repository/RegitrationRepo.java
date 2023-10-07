package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.entity.Registration;

public interface RegitrationRepo extends JpaRepository<Registration, Integer> {

}
