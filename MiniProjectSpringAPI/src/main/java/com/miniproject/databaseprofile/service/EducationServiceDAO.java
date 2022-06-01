package com.miniproject.databaseprofile.service;

import com.miniproject.databaseprofile.model.Education;

public interface EducationServiceDAO {
	public int save(Education e);
	public int update(Education e);
}
