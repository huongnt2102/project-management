package com.hg.pma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.pma.dao.ProjectRepository;
import com.hg.pma.dto.ChartData;
import com.hg.pma.dto.TimeChartData;
import com.hg.pma.entities.Employee;
import com.hg.pma.entities.Project;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository proRepo;
	
	
	public Project save(Project project) {
		return proRepo.save(project);
	}
	
	public Project findByProjectId(long theId) {
		// TODO Auto-generated method stub
		return proRepo.findByProjectId(theId);
	}

	public void delete(Project thePro) {
		proRepo.delete(thePro);
		
	}

	public List<Project> getAll() {
		return proRepo.findAll();
	}
	
	public List<ChartData> getProjectStatus(){
		return proRepo.getProjectStatus();
	}
	
	public List<TimeChartData> getTimeData(){
		return proRepo.getTimeData();
	}
}
