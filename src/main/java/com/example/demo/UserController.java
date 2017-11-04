package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.service.RegistrationService;
import com.example.serviceImpl.RegistrationServiceImpl;

@RestController
@RequestMapping("/users")


public class UserController {

	@Autowired
	RegistrationService registrationService;
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("Register");

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/registerUser" )
	public ModelAndView registerUser(HttpServletRequest req,HttpServletResponse res) {
		

		String first_name=req.getParameter("first_name");
		String last_name=req.getParameter("last_name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		User user = new User();
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		//user.setEmail(email);
		user.setPassword(password);
		//registrationService.registerStudent(user);
		ModelAndView mav=new ModelAndView("login");
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getUserDetails" )
	public List<User> getUserDetails() {
		return registrationService.getUserDetails();
		
	}

}
