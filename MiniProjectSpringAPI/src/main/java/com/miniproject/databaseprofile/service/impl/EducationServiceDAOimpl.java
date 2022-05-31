package com.miniproject.databaseprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.Education;
import com.miniproject.databaseprofile.repository.EducationDAO;
import com.miniproject.databaseprofile.service.EducationServiceDAO;

@Service
public class EducationServiceDAOimpl implements EducationServiceDAO {
	@Autowired
	EducationDAO educationRepository;
	
	@Override
	public int save(Education e) {
		return educationRepository.save(e);
	}

}
