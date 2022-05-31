package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.model.Univ;
import com.miniproject.databaseprofile.repository.ProfileDAO;

@Repository
public class ProfileDAOimpl implements ProfileDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int save(Profile p, Univ u, Skill s) {
		return jdbc.update("begin;"
				+ " insert into profile(name, univ_id, grad_yr, gend_id, phone, skills_id)"
				+ "values"
				+ "(?,?,?,?,?,?);"
				+ "insert into univ(name) value(?);"
				+ "insert into skill(", new Object[] {p.getName(), p.getUnivId(), p.getGradYr(),
					p.getGendId(), p.getPhone(), p.getSkillsId()});
	}

}
