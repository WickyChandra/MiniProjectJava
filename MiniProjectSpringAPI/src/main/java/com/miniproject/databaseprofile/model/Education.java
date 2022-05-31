package com.miniproject.databaseprofile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int univ_id;
	private int grad_yr;
	public Education(int univ_id2, int grad_yr2) {
		this.setUniv_id(univ_id2);
		this.setGrad_yr(grad_yr2);
	}
}
