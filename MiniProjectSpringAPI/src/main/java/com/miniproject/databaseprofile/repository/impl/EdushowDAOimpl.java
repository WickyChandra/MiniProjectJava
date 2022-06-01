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
		return jdbc.update("insert into edushow\r\n"
				+ "(select e.id as id, e.grad_yr as grad_yr, u.nameu as univ_nm  from education e\r\n"
				+ "join univ u\r\n"
				+ "on u.id = e.univ_id);");
	}

}
