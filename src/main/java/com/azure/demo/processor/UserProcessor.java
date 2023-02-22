/**
 * 
 */
package com.azure.demo.processor;

import org.springframework.stereotype.Service;

import com.azure.demo.model.User;
import com.azure.demo.model.UserRequest;
import com.azure.demo.model.UserResponse;
import com.azure.demo.service.UserServiceRepository;

/**
 * @author 3719072
 *
 */
@Service
public class UserProcessor {

	
	private final UserServiceRepository userServiceRepository;
	
	public UserProcessor(final UserServiceRepository userServiceRepository) {
		this.userServiceRepository = userServiceRepository;
	}
	
	public UserResponse createUser(UserRequest userRequest) {
		User user = userServiceRepository.createUser(userRequest.getUser());
		UserResponse response = new UserResponse();
		response.setUser(user);
		return response;
	}
}
