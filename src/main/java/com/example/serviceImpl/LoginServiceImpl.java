package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.LoginUser;
import com.example.repoImpl.LoginDaoImpl;
import com.example.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDaoImpl loginDaoImpl;
	@Override
	public void LoginStudent(LoginUser login) {
		// TODO Auto-generated method stub

	}

}
