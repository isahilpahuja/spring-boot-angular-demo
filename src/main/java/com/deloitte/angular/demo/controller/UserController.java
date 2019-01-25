package com.deloitte.angular.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.angular.demo.model.User;
import com.deloitte.angular.demo.repository.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/listUsers")
	public List<User> getUsers()
	{
		return  userRepository.findAll();
		
		
	}
	
	/*@PostMapping("/add")
	public UserResponseView saveUser(@RequestBody UserRequestView  userRequestView)
	{
		User user=userRepository.save(populateUser(userRequestView));
		UserResponseView userResponseView=populateUserResponseView(user);
		return userResponseView;
	}*/
	 @PostMapping("/add")
	    public User createUser(@Valid @RequestBody User user) {
	        return userRepository.save(user);
	    }

	/*private User populateUser(UserRequestView userRequestView) {
		User user= new User();
		if(userRequestView!=null)
		{
			user.setPassword(userRequestView.getPassword());
			user.setPhone(userRequestView.getPhone());
			user.setUserName(userRequestView.getUserName());
			user.setUserId(userRequestView.getUserId());
		}
		return user;
	}
	
	private UserResponseView populateUserResponseView(User user) {
		UserResponseView userResponseView= new UserResponseView();
		if(user!=null)
		{
			userResponseView.setPassword(user.getPassword());
			userResponseView.setPhone(user.getPhone());
			userResponseView.setUserName(user.getUserName());
			userResponseView.setUserId(user.getUserId());
			
		}
		return userResponseView;
	}*/
	
}
