/**
 * 
 */
package com.azure.demo.model;

import java.util.List;

/**
 * @author 3719072
 *
 */
public class CommonResponse {

	private List<Alert> alert;
	private List<ErrorResponse> error;
	/**
	 * @return the alert
	 */
	public List<Alert> getAlert() {
		return alert;
	}
	/**
	 * @param alert the alert to set
	 */
	public void setAlert(List<Alert> alert) {
		this.alert = alert;
	}
	/**
	 * @return the error
	 */
	public List<ErrorResponse> getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(List<ErrorResponse> error) {
		this.error = error;
	}
	
}
