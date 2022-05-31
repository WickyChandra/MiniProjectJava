package com.miniproject.databaseprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.Univ;
import com.miniproject.databaseprofile.repository.UnivDAO;
import com.miniproject.databaseprofile.service.UnivServiceDAO;
@Service
public class UnivServiceDAOimpl implements UnivServiceDAO {
	@Autowired
	UnivDAO univRepository;

	@Override
	public int save(Univ u) {
		return univRepository.save(u);
	}
}
