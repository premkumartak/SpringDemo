/**
 * 
 */
package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.LoginUser;
import com.example.model.User;

/**
 * @author Sony
 *
 */
@Service
public interface RegistrationService {
	
	void registerStudent(User user);

	
	List<User> getUserDetails();


}
