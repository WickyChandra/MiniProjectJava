package com.miniproject.databaseprofile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.submission.Edushow;
import com.miniproject.databaseprofile.model.submission.Profilepage;
import com.miniproject.databaseprofile.repository.EdushowDAO;
import com.miniproject.databaseprofile.repository.ProfilepageDAO;
import com.miniproject.databaseprofile.service.ProfilepageServiceDAO;
@Service
public class ProfilepageServiceDAOimpl implements ProfilepageServiceDAO {
	@Autowired
	ProfilepageDAO profilepageRepository;
	
	@Autowired
	EdushowDAO edushowRepository;
	
	@Override
	public List<Profilepage> show() {
		edushowRepository.joinedu();
		return profilepageRepository.selectAll();
	}

	@Override
	public List<Profilepage> showpage(int pg) {
		return profilepageRepository.showpage(pg);
	}

}
