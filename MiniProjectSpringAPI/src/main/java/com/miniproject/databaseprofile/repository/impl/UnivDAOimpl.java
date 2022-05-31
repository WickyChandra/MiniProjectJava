package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.Univ;
import com.miniproject.databaseprofile.repository.UnivDAO;

@Repository
public class UnivDAOimpl implements UnivDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(Univ u) {
		return jdbc.update("insert into univ(nameu)"
				+ "value"
				+ "(?)",u.getNameU());
	}
}
