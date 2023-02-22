/**
 * 
 */
package com.azure.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azure.demo.model.UserRequest;
import com.azure.demo.model.UserResponse;
import com.azure.demo.processor.UserProcessor;

/**
 * @author 3719072
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserProcessor userProcessor;
	
	@PostMapping("/createUser")
	public UserResponse createUser(@RequestBody UserRequest userRequest,
            HttpServletRequest request) {
		return userProcessor.createUser(userRequest);
	}

}
