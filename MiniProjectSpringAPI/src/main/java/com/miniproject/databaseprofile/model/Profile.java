package com.miniproject.databaseprofile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int gend_id;
	private String phone;
	public Profile(String name2, int gend_id2, String phone2) {
		this.setName(name2);
		this.setGend_id(gend_id2);
		this.setPhone(phone2);
	}
	public Profile(int id2, String name2, int gend_id2, String phone2) {
		this.setId(id2);
		this.setName(name2);
		this.setGend_id(gend_id2);
		this.setPhone(phone2);
	}
}
