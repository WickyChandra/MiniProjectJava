package com.miniproject.databaseprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.ProfileRaw;
import com.miniproject.databaseprofile.repository.ProfileRawDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;

@Service
public class ProfileRawServiceDAOimpl implements ProfileRawServiceDAO {
	@Autowired
	ProfileRawDAO profileRawRepository;
	
	@Override
	public int save(ProfileRaw p) {
		return profileRawRepository.save(p);
	}

}
