package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.repository.ProfileDAO;

@Repository
public class ProfileDAOimpl implements ProfileDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(Profile p) {
		return jdbc.update(" insert into profile(name, gend_id, phone)"
				+ "values"
				+ "(?,?,?);", new Object[] {p.getName(), p.getGend_id(), p.getPhone()});
	}

	@Override
	public int delete(int id) {
		return jdbc.update("delete from profile where id=?",id);
	}

}
