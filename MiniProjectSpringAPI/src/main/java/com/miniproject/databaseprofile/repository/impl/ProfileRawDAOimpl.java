package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.ProfileRaw;
import com.miniproject.databaseprofile.repository.ProfileRawDAO;

@Repository
public class ProfileRawDAOimpl implements ProfileRawDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(ProfileRaw p) {
		return jdbc.update("insert into profile(name, univ, grad_yr, gender, phone, skills)"
				+ "values"
				+ "(?,?,?,?,?,?)", new Object[] {p.getName(), p.getUniv(), p.getGrad_yr(),
					p.getGender(), p.getPhone(), p.getSkills()});
	}

}
