package com.miniproject.databaseprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.databaseprofile.model.Education;
import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.model.ProfileRaw;
import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.repository.EducationDAO;
import com.miniproject.databaseprofile.repository.ProfileDAO;
import com.miniproject.databaseprofile.repository.SkillDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;
@Service
public class ProfileRawServiceDAOimpl implements ProfileRawServiceDAO {
	@Autowired
	ProfileDAO profileRawRepository;
	@Autowired
	EducationDAO educationRepository;
	@Autowired
	SkillDAO skillRepository;
	@Override
	public int save(ProfileRaw pr) {
		
		return profileRawRepository.save(new Profile(pr.getName(), pr.getGend_id(), pr.getPhone()))
		* educationRepository.save(new Education(pr.getUniv_id(),pr.getGrad_yr()))
		* skillRepository.save(new Skill(pr.getSkillId()));
	}
	@Override
	public int delete(int id) {
		return profileRawRepository.delete(id) * 
				educationRepository.delete(id) *
				skillRepository.delete(id);
	}
	@Override
	public int update(ProfileRaw pr) {
		// TODO Auto-generated method stub
		return profileRawRepository.update(new Profile(pr.getId(),pr.getName(), pr.getGend_id(), pr.getPhone())) * 
				educationRepository.update(new Education(pr.getId(),pr.getUniv_id(),pr.getGrad_yr())) *
				skillRepository.update(new Skill(pr.getId(),pr.getSkillId()));
	}
	

}
