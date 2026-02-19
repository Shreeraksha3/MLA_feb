package com.test.voter;
//RuntimeException
public class AgeValidationException extends RuntimeException
{
	private static final long serialVersionUID=1L;
	public AgeValidationException(String msg)
	{
		super(msg);
	}
}
