package com.naturalNumbers;

public class NaturalNumbers 
{
	/*
	 * If the given values are 11 and 20, return a 
	 * string of Natural Numbers as "11 12 13 14 15 16 17 18 19 20". 
	 */
	public static String getNaturalNumbers(int start, int end) 
	{
		//Declaration
		String result = "";		
		
		//Logic
		if(start <=0 || end <=0)
			return "-1";
		if(start > end)
			return "-2";
		
		for(int i = start; i <=end; i++)
		{
			if(i == end)
				result += Integer.toString(i);
			
			else
				result += Integer.toString(i) + " ";
		}
		return result;
		
		
	}

}
