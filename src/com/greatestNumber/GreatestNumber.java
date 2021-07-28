package com.greatestNumber;

public class GreatestNumber 
{
	
	public static int getMaxNumber(int[] input) 
	{		
		int greatest = input[0];
		
		if(input[1] > greatest)
			greatest = input[1];
		if(input[2] > greatest)
			greatest =input[2]; 
		
		return greatest;
		
	}

}
