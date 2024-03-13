package com.test8;

public class PasswordValidation {
	public static void main(String args[])
	{
		

		try
		{
			validPassword("Rushi 123");
			System.out.println("password is valid");	
	
		}
		catch(InvalidPasswordException e)
		{
			System.out.println(e);
		}
	
	}
	public static void validPassword(String password)
	{
		
		if(password.length()<8 || password.length()>15)
		{
			throw new InvalidPasswordException("Password must be between 8 and 15 characters.");
		}

		if(password.contains(" "))
		{	
			throw new InvalidPasswordException("Password cannot contain white space");
		}

		boolean upper =false;
		boolean lower = false;
		boolean numbers = false;
		boolean special = false;

		for(int i = 0; i < password.length(); i++)
		{
			char ch = password.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper = true;
			}
			else if(ch>=97 && ch<=122)
			{
				lower = true;
			}
			else if(ch>=48 && ch<=57)
			{
				numbers = true;
			}
			else if(ch=='#' || ch=='$' || ch=='@' || ch=='.')
			{
				special = true;
			}
		}
		if(!upper && !lower && !numbers && !special)
		{
			throw new InvalidPasswordException("Password must contain uppercase, lowercase, number and special character(#,$,@,.)");
		}
	}

	
}
