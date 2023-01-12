package com.hg.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hg.pma.dao.EmployeeRepository;
import com.hg.pma.dao.ProjectRepository;
import com.hg.pma.entities.Employee;
import com.hg.pma.entities.Project;


@Controller
public class HomeController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository emRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		
		// query the database for projects
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projects", projects);
		
		// query the database for employees
		List<Employee> employees = emRepo.findAll();
		model.addAttribute("employees", employees);
		return "main/home";
	}
	
	
}
