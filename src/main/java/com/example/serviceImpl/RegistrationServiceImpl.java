package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.LoginUser;
import com.example.model.User;
import com.example.repoImpl.RegistrationDaoImpl;
import com.example.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	RegistrationDaoImpl registrationDaoImpl;
	
	
	@Override
	public void registerStudent(User user) {
		registrationDaoImpl.registerStudent(user);

	}


	@Override
	public List<User> getUserDetails() {
		// TODO Auto-generated method stub
		return registrationDaoImpl.selectAll();
	}


}
