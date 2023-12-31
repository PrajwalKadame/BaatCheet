package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LeavsUsersDao;
import com.sangamone.model.LeavsCompanies;
import com.sangamone.model.LeavsCompanyUser;
import com.sangamone.model.LeavsUsers;

@RestController
public class LeavsUsersController {
	@Autowired
	LeavsUsersDao leavsUsersDao;
	
	@PostMapping("/addLeavsUser")
	public String addLeavsUser(@RequestBody LeavsCompanyUser leavsCompanyUser) {
		return leavsUsersDao.addLeavsUser(leavsCompanyUser);
	}
	
	@GetMapping("/viewLeavsUsers")
	public List<LeavsUsers> viewLeavsUsers() {
		return leavsUsersDao.viewLeavsUsers();
		
	}

}
