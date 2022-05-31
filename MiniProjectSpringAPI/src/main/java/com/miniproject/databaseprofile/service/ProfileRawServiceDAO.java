package com.miniproject.databaseprofile.service;

import com.miniproject.databaseprofile.model.ProfileRaw;

public interface ProfileRawServiceDAO {
	public int save(ProfileRaw pr);
	public int delete(int id);
}
