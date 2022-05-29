package com.miniproject.databaseprofile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.ProfileRaw;
import com.miniproject.databaseprofile.repository.ProfileRawDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;

@Component
@RestController
public class ProfileRawController {
	
	@Autowired
	ProfileRawDAO profileRawDao;
	
	@Autowired
	ProfileRawServiceDAO profileRawServiceDao;
	
	@PostMapping("/postProfile")
	public String save(@RequestBody ProfileRaw p) {
		return profileRawServiceDao.save(p) + "Data berhasil disimpan";
	}
}
