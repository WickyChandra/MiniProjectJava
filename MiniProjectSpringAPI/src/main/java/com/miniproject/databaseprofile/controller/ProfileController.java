package com.miniproject.databaseprofile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.Education;
import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.model.ProfileRaw;
import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.repository.EducationDAO;
import com.miniproject.databaseprofile.repository.ProfileDAO;
import com.miniproject.databaseprofile.repository.SkillDAO;
import com.miniproject.databaseprofile.service.EducationServiceDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;
import com.miniproject.databaseprofile.service.ProfileServiceDAO;
import com.miniproject.databaseprofile.service.SkillServiceDAO;

@Component
@RestController
public class ProfileController {
	
	@Autowired
	ProfileDAO profileDao;
	
	@Autowired
	ProfileServiceDAO profileServiceDao;
	
	@PostMapping("/postProfile")
	public String save(@RequestBody Profile p) {
		return profileServiceDao.save(p) + "Data berhasil disimpan";
	}
	@Autowired
	EducationDAO educationDao;
	
	@Autowired
	EducationServiceDAO educationServiceDao;
	
	@Autowired
	SkillDAO skillDao;
	
	@Autowired
	SkillServiceDAO skillServiceDao;
	
	@Autowired
	ProfileRawServiceDAO profileRawServiceDao;
	
	@PostMapping("/postAllProfile")
	public String saveall(@RequestBody ProfileRaw pr) {
		return profileRawServiceDao.save(pr) +" Data berhasil disimpan";
	}
}
