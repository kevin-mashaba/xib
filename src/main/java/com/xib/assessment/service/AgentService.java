package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xib.assessment.entity.Agent;
import com.xib.assessment.repository.AgentRepository;

@Service
public class AgentService {

	@Autowired
	private AgentRepository agentRepository;
	
	
	//This method creates an Agent
	public Agent createAgent(Agent agent)
	{
		return agentRepository.save(agent);
	}
	
	
	//This method returns a single agent
	public Optional<Agent> getAgentById(Long id) throws Exception{
		return Optional.of(agentRepository.findById(id).orElseThrow(() -> new Exception("Agent not found")));
	}
	
	
	
	//This method gets all agents
	public Page<Agent> getAgents(int page,int size)
	{
		Pageable pageable = PageRequest.of(page, size);
		return agentRepository.findAll(pageable);
	}
	
	 
}
