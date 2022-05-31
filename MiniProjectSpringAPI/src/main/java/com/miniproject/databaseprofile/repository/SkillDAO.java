package com.miniproject.databaseprofile.repository;

import com.miniproject.databaseprofile.model.Skill;

public interface SkillDAO {
	public int save(Skill s);
	public int delete(int id);
}
