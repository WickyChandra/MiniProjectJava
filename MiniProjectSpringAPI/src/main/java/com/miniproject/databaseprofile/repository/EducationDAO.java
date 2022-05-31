package com.miniproject.databaseprofile.repository;

import com.miniproject.databaseprofile.model.Education;

public interface EducationDAO {
	public int save(Education e);
	public int delete(int id);
}
