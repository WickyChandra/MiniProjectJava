package com.miniproject.databaseprofile.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.model.submission.Profilepage;
import com.miniproject.databaseprofile.repository.ProfilepageDAO;

@Repository
public class ProfilepageDAOimpl implements ProfilepageDAO {
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Profilepage> selectAll() {
		return jdbc.query("select p.name, e.univ_nm as univ_name , e.grad_yr, p.phone, g.nameg as gendr from profile p \r\n"
				+ "join edushow e on e.id = p.id\r\n"
				+ "join gender g on g.id = p.gend_id;", new BeanPropertyRowMapper<Profilepage>(Profilepage.class));
	}

	@Override
	public List<Profilepage> showpage(int pg) {
		// TODO Auto-generated method stub
		return jdbc.query("select p.name, e.univ_nm, e.grad_yr, p.phone, g.nameg from profile p \r\n"
				+ "join temp e on e.id = p.id and p.id > ?\r\n"
				+ "join gender g on g.id = p.gend_id \r\n"
				+ "limit 10;", new BeanPropertyRowMapper<Profilepage>(Profilepage.class),((pg-1)*10));
	}
}
