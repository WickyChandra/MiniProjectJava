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
		return jdbc.update("insert into education(grad_yr, univ_id)"
				+ "values"
				+ "(?,?)",new Object[] {e.getGrad_yr(), e.getUniv_id()});
	}

	@Override
	public int delete(int id) {
		return jdbc.update("delete from education where id=?",id);
	}

	@Override
	public int update(Education e) {
		return jdbc.update("update education "
				+ "set grad_yr = ? , "
				+ "univ_id = ? "
				+ "where id = ?",new Object[] {e.getGrad_yr(), e.getUniv_id(),e.getId()});
	}

}
