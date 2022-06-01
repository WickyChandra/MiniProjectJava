package com.miniproject.databaseprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.Education;
import com.miniproject.databaseprofile.repository.EducationDAO;
import com.miniproject.databaseprofile.service.EducationServiceDAO;
@Component
@RestController
public class EducationController {
	@Autowired
	EducationDAO educationDao;
	
	@Autowired
	EducationServiceDAO educationServiceDao;
	
	@PostMapping("/postEducation")
	public String save(Education e) {
		return educationServiceDao.save(e)+"complete";
	}
	
	@PutMapping("/putEducationUpdate")
	public String update(@RequestBody Education e) {
		return educationServiceDao.update(e)+" Data berhasil dubah";
	}
}
