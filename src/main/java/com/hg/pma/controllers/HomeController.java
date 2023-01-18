package com.hg.pma.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hg.pma.dao.EmployeeRepository;
import com.hg.pma.dao.ProjectRepository;
import com.hg.pma.dto.ChartData;
import com.hg.pma.dto.EmployeeProject;
import com.hg.pma.entities.Project;


@Controller
public class HomeController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository emRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) throws JsonProcessingException{
		
		Map<String, Object> map = new HashMap<> ();
		
		// query the database for projects
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		
		List<ChartData> projectData = proRepo.getProjectStatus();
		
		// Lets convert projectData object into a json structure for use in javascript
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(projectData);
		
		model.addAttribute("projectStatusCnt", jsonString);
		
		// query the database for employees
		List<EmployeeProject> employeesProjectCnt = emRepo.employeeProjects();
		model.addAttribute("employeesListProjectCnt", employeesProjectCnt);
		
		return "main/home";
	}
	
	
}
