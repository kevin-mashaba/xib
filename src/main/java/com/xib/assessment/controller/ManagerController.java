package com.xib.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.entity.Manager;
import com.xib.assessment.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	
	@RequestMapping(value = "/manager",method = RequestMethod.POST,produces = "application/json")
	public Manager createManager(@RequestBody Manager manager) {
		return managerService.createManager(manager);
	}
	
}
