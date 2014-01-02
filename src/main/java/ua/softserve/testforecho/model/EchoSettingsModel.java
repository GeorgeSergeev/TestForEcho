package ua.softserve.testforecho.model;

import java.io.Serializable;

public class EchoSettingsModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2491362139880192508L;
	String message;
	int statusCode;
	
	public EchoSettingsModel() {
		message=null;
		statusCode=403;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
