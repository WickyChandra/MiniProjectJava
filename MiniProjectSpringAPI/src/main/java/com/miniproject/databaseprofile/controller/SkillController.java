package com.miniproject.databaseprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.repository.SkillDAO;
import com.miniproject.databaseprofile.service.SkillServiceDAO;

@Component
@RestController
public class SkillController {
	@Autowired
	SkillDAO skillDao;
	
	@Autowired
	SkillServiceDAO skillServiceDao;
	
	@PostMapping("/postSkill")
	public String save(@RequestBody Skill s) {
		return skillServiceDao.save(s)+"complete";
	}
	
}
