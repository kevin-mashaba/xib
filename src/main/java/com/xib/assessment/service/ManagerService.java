package com.xib.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.entity.Manager;
import com.xib.assessment.repository.ManagerRepository;

@Service
public class ManagerService {

	@Autowired
	private ManagerRepository managerRepository;
	
	
	//This method creates a manager
	public Manager createManager(Manager manager) {
		return managerRepository.save(manager);
	}
	
}
