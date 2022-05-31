package com.miniproject.databaseprofile.service;

import java.util.List;

import com.miniproject.databaseprofile.model.submission.Profilepage;

public interface ProfilepageServiceDAO {
	public List<Profilepage> show();
	public List<Profilepage> showpage(int pg);
}
