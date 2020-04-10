package com.contentManagement.common;

public class ArticlesAlreadyExistException {
	
	public static  String message="articles already exists";


	public ArticlesAlreadyExistException()
	{
		
	}
	public ArticlesAlreadyExistException(String message)
	{
		this.message=message;
	}

}
