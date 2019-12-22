package com.vivek.demo.exception;

public class InvalidEmployeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeException()
	{
		super();
	}
	
	public InvalidEmployeeException(String message)
	{
		super(message);
	}
}
