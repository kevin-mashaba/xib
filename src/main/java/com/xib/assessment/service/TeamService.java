package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.entity.Team;
import com.xib.assessment.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	
	//This method creates a team
	public Team createTeam(Team team) {
		
		return teamRepository.save(team);
	}
	
	//This method gets a team by ID
	public Optional<Team> getTeamById(Long id) throws Exception {
		System.out.print("Are you even called Team?");
		return Optional.of(teamRepository.findById(id).orElseThrow(() -> new Exception("Team does not exist")));
			
	}
	
	//This method returns all Teams
	public List<Team> getAllTeams()
	{
		return teamRepository.findAll();
	}
}
