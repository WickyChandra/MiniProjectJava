package com.miniproject.databaseprofile.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.databaseprofile.model.Profile;
import com.miniproject.databaseprofile.model.ProfileRaw;
import com.miniproject.databaseprofile.model.submission.Profilepage;
import com.miniproject.databaseprofile.repository.EducationDAO;
import com.miniproject.databaseprofile.repository.ProfileDAO;
import com.miniproject.databaseprofile.repository.SkillDAO;
import com.miniproject.databaseprofile.service.EducationServiceDAO;
import com.miniproject.databaseprofile.service.ProfileRawServiceDAO;
import com.miniproject.databaseprofile.service.ProfileServiceDAO;
import com.miniproject.databaseprofile.service.ProfilepageServiceDAO;
import com.miniproject.databaseprofile.service.SkillServiceDAO;

@Component
@RestController
public class ProfileController {
	
	@Autowired
	ProfileDAO profileDao;
	
	@Autowired
	ProfileServiceDAO profileServiceDao;
	
	@PostMapping("/postProfile")
	public String save(@RequestBody Profile p) {
		return profileServiceDao.save(p) + "Data berhasil disimpan";
	}

	@Autowired
	ProfileRawServiceDAO profileRawServiceDao;
	
	@Autowired
	ProfilepageServiceDAO profilepageServiceDao;
	
	@PostMapping("/postAllProfile")
	public String saveall(@RequestBody ProfileRaw pr) {
		return profileRawServiceDao.save(pr) +" Data berhasil disimpan";
	}
	@GetMapping("/getProfileAll")
	public List<Profilepage> showall() {
		return profilepageServiceDao.show();
	}
	@GetMapping("/getProfile/{pg}")
	public List<Profilepage> showpage(@PathVariable int pg) {
		return profilepageServiceDao.showpage(pg);
	}
	@PutMapping("/putProfileUpdate")
	public String update(@RequestBody Profile p) {
		return profileServiceDao.update(p) +" Data berhasil dubah";
	}
	@PutMapping("/putProfileAllUpdate")
	public String updateall(@RequestBody ProfileRaw pr) {
		return profileRawServiceDao.update(pr) +" Data berhasil dubah";
	}
	@DeleteMapping("/deleteProfile")
	public String delete(@RequestBody int id) {
		return profileRawServiceDao.delete(id) +" Data berhasil dihapus";
	}
}
