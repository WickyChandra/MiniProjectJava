package com.miniproject.databaseprofile.repository;

import com.miniproject.databaseprofile.model.Profile;

public interface ProfileDAO {
	public int save(Profile p);
	public int delete(int id);
	public int update(Profile p);
}
