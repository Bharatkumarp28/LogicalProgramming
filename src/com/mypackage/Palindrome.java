package com.mypackage;

public class Palindrome 
{
	
	public int isPalindrome(int input)
	{
		//If given number is both three digit and Palindrome
		// return 1 or else return 0
		if(input <= 99 || input > 999)
			return -1;
		
		//Logic
		if(input%10 == input/100)
			return 1;
		else
			return 0;	
	}

}
