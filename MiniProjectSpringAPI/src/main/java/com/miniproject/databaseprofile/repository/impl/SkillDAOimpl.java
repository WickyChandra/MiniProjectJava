package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.repository.SkillDAO;
@Repository
public class SkillDAOimpl implements SkillDAO {
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int save(Skill s) {
		System.out.println(s.toString());
		return jdbc.update(" insert into skill(skill_id)"
				+ "value"
				+ "(?)",s.toString());
	}

}