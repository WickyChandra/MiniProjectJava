package com.miniproject.databaseprofile.repository;

import java.util.List;

import com.miniproject.databaseprofile.model.submission.Profilepage;


public interface ProfilepageDAO {
	public List<Profilepage> selectAll();
	public List<Profilepage> showpage(int pg);
}
