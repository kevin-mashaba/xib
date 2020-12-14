package com.xib.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.entity.Team;
import com.xib.assessment.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	
	@RequestMapping(value = "/team",method = RequestMethod.POST,produces = "application/json")
	public Team createTeam(@RequestBody Team team)
	{
		return teamService.createTeam(team);
	}
	
	@RequestMapping(value = "/team/{id}",method = RequestMethod.GET,produces = "application/json")
	public Optional<Team> getTeamById(@PathVariable(name = "id")Long id) throws Exception
	{
		return teamService.getTeamById(id);
	}
	
	
	@RequestMapping(value = "/teams",method = RequestMethod.GET,produces = "application/json")
	public List<Team> getAllTeams()
	{
		return teamService.getAllTeams();
	}
}
