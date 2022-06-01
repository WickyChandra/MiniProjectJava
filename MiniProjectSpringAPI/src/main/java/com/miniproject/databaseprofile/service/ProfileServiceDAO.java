package com.miniproject.databaseprofile.service;

import com.miniproject.databaseprofile.model.Profile;

public interface ProfileServiceDAO {
	public int save(Profile p);
	public int update(Profile p);
}
