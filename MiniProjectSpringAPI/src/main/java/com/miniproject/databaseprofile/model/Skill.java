package com.miniproject.databaseprofile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int[] skillId;
	public Skill(int[] skillId2) {
		this.setSkillId(skillId2);
	}
	public Skill(int id2, int[] skillId2) {
		this.setSkillId(skillId2);
		this.setId(id2);
	}
}
