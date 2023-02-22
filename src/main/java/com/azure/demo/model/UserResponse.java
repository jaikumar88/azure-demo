/**
 * 
 */
package com.azure.demo.model;

/**
 * @author 3719072
 *
 */
public class UserResponse extends CommonResponse {
	
	private User user;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
