/**
 * 
 */
package com.azure.demo.service;

import org.springframework.stereotype.Component;

import com.azure.demo.model.User;

/**
 * @author 3719072
 *
 */
@Component
public class UserServiceRepositoryImpl implements UserServiceRepository {

	@Override
	public User createUser(User user) {
		
		return user;
	}

}
