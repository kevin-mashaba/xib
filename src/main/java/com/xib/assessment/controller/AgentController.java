package com.xib.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.entity.Agent;
import com.xib.assessment.service.AgentService;

@RestController
public class AgentController {

	
	@Autowired
	private AgentService agentService;
	


    @RequestMapping(value = "/agent",method = RequestMethod.POST,produces = "application/json")
    public Agent createAgent(@RequestBody Agent agent)
    {
    	return agentService.createAgent(agent);
    }
    
    
    @GetMapping(value = "/agent/{id}",produces = "application/json")
	public Optional<Agent> getTeamById(@PathVariable(name = "id")Long id) throws Exception
	{
    	
		return agentService.getAgentById(id);
	}
  
    
    @RequestMapping(value = "/agents",method = RequestMethod.GET,produces = "application/json")
    public Page<Agent> getAllAgents(@RequestParam(name = "page",defaultValue = "0")int page, 
    								@RequestParam(name = "size",defaultValue = "10")int size)
    {
    	
    	return agentService.getAgents(page, size);
    }
}
