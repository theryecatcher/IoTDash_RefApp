/**
 * 
 */
package com.ge.predix.solsvc.dataseed.response;

/**
 * @author 212421693
 *
 */
public class ErrorResponse {
	 private Integer status;
	 private String error;
	 private String message;
	 
	 
	/**
	 * @param status -
	 * @param error -
	 * @param message -
	 */
	public ErrorResponse(Integer status, String error, String message) {
		super();
		this.status = status;
		this.error = error;
		this.message = message;
	}
	
	/**
	 * @return -
	 */
	public Integer getStatus() {
		return this.status;
	}
	/**
	 * @param status -
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return -
	 */
	public String getError() {
		return this.error;
	}
	/**
	 * @param error -
	 */
	public void setError(String error) {
		this.error = error;
	}
	/**
	 * @return -
	 */
	public String getMessage() {
		return this.message;
	}
	/**
	 * @param message -
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	 
	 
}
