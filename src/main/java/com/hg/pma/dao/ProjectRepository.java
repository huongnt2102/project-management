package com.hg.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hg.pma.dto.ChartData;
import com.hg.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{
	
	@Override
	public List<Project> findAll();
	
	@Query(nativeQuery=true, value="SELECT stage as label, COUNT(*) as status "
			+ "FROM project "
			+ "GROUP BY stage")
	public List<ChartData> getProjectStatus();
}
