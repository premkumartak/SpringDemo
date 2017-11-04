package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;

@Controller
public class SpringHelloExample {

	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("Register");

	}
	
	@RequestMapping("/loginSucess")
	public ModelAndView loginSucess() {
		return new ModelAndView("loginSucess");

	}
	
	@RequestMapping(value="/getDetails",method=RequestMethod.GET)
	public ModelAndView getUserDetail(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
				List<User> usres = new ArrayList<>();
		return new ModelAndView("welcome");
	}
}
