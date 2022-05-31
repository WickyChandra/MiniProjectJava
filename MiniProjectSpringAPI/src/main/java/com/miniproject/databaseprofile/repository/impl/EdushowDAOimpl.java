package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.repository.EdushowDAO;
@Repository
public class EdushowDAOimpl implements EdushowDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int joinedu() {
		return jdbc.update("create table temp (select e.id as id, u.nameu as univ_nm, e.grad_yr as grad_yr  from education e\r\n"
				+ "join univ u\r\n"
				+ "on u.id = e.univ_id);");
	}

}
