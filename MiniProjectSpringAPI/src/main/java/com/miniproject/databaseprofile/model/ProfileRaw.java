package com.miniproject.databaseprofile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProfileRaw {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String univ;
	private int grad_yr;
	private String gender;
	private String phone;
	private String skills;
	
}
