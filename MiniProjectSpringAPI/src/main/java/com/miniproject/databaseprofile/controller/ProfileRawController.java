package com.miniproject.databaseprofile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.repository.ProfileDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;

@Component
@RestController
public class ProfileRawController {
	
	@Autowired
	ProfileDAO profileRawDao;
	
	@Autowired
	ProfileRawServiceDAO profileRawServiceDao;
	
	@PostMapping("/postProfile")
	public String save(@RequestBody Profile p) {
		return profileRawServiceDao.save(p) + "Data berhasil disimpan";
	}
}
