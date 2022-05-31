package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.Education;
import com.miniproject.databaseprofile.repository.EducationDAO;

@Repository
public class EducationDAOimpl implements EducationDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(Education e) {
		System.out.println(e.getGrad_yr());
		return jdbc.update("insert into education(grad_yr, univ_id)"
				+ "values"
				+ "(?,?)",new Object[] {e.getGrad_yr(), e.getUniv_id()});
	}

}
