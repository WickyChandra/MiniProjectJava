package com.miniproject.databaseprofile.repository;

import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.model.Skill;
import com.miniproject.databaseprofile.model.Univ;

public interface ProfileDAO {
	public int save(Profile p, Univ u, Skill s);
}
