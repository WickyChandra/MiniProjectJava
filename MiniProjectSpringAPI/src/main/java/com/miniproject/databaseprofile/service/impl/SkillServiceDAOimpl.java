package com.miniproject.databaseprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.repository.SkillDAO;
import com.miniproject.databaseprofile.service.SkillServiceDAO;
@Service
public class SkillServiceDAOimpl implements SkillServiceDAO {
	@Autowired
	SkillDAO skillRepository;
	@Override
	public int save(Skill s) {
		return skillRepository.save(s);
	}
	@Override
	public int update(Skill s) {
		return skillRepository.update(s);
	}

}
