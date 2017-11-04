package com.example.repo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.LoginUser;
import com.example.model.User;
@Service
public interface RegistrationDao {
	
	void registerStudent(User user);
	
	public List<User> selectAll();

	

}
