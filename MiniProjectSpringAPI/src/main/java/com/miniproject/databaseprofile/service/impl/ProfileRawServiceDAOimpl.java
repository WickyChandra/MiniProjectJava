package com.miniproject.databaseprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.repository.ProfileDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;

@Service
public class ProfileRawServiceDAOimpl implements ProfileRawServiceDAO {
	@Autowired
	ProfileDAO profileRawRepository;
	
	@Override
	public int save(Profile p) {
		return profileRawRepository.save(p);
	}

}
