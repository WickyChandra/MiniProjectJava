package com.miniproject.databaseprofile.model.submission;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Edushow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String univ_nm;
	private int grad_yr;
}
