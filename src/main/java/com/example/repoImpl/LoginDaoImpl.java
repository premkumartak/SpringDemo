package com.example.repoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.PersonRowMapper;
import com.example.model.LoginUser;
import com.example.model.User;
import com.example.repo.LoginDao;

public class LoginDaoImpl implements LoginDao {
 
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean LoginStudent(LoginUser login) {
		return false;
	
				}

}
