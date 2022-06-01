package com.miniproject.databaseprofile.model.submission;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Skillcol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int skill1;
	private int skill2;
	private int skill3;
	private int skill4;
}
