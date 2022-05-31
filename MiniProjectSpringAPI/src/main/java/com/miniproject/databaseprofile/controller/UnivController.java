package com.miniproject.databaseprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.Univ;
import com.miniproject.databaseprofile.repository.UnivDAO;
import com.miniproject.databaseprofile.service.UnivServiceDAO;
@Component
@RestController
public class UnivController {
	@Autowired
	UnivDAO univDao;
	
	@Autowired
	UnivServiceDAO univServiceDao;
	
	@PostMapping("/postUniv")
	public String save(Univ u) {
		return univServiceDao.save(u)+"complete";
	}
}
