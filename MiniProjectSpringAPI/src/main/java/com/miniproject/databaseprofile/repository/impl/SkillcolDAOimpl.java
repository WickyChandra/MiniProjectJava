package com.miniproject.databaseprofile.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.databaseprofile.repository.SkillcolDAO;
@Repository
public class SkillcolDAOimpl implements SkillcolDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int scaleToCol() {
		return jdbc.update("insert into skillcol"
				+ "(select s.id as id, substring_index(s.skill_id,',',1) as skill1,"
				+ "substring_index(substring_index(s.skill_id,',',2),',',-1) as skill2,"
				+ "substring_index(substring_index(s.skill_id,',',-2),',',1) as skill3, "
				+ "substring_index(s.skill_id,',',-1) as skill4 "
				+ "from skill s)");
	}

	@Override
	public int joinskillnm() {
		return jdbc.update("insert into skillshow (select sc.id as id, sl.name as skill1, sl1.name as skill2,\r\n"
				+ "   sl2.name as skill3, sl3.name as skill4 from skillcol sc\r\n"
				+ "   join skill_list sl on sl.id=sc.skill1\r\n"
				+ "   join skill_list sl1 on  sl1.id=sc.skill2\r\n"
				+ "   join skill_list sl2 on  sl2.id=sc.skill3\r\n"
				+ "   join skill_list sl3 on sl3.id=sc.skill4);");
	}

}
