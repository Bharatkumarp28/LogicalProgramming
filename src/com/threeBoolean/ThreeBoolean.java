package com.threeBoolean;

/*
 * A program which accepts three boolean values and 
 * returns true if any two values are true else return false
 */

public class ThreeBoolean 
{
	private boolean b1;
	private boolean b2;
	private boolean b3;
		
	public ThreeBoolean(boolean b1,boolean b2,boolean b3)
	{
		this.setB1(b1);
		this.setB2(b2);
		this.setB3(b3);
		
	}
	
	public boolean getB1()
	{
		return b1;
	}
	
	public void setB1(boolean b1) {
		this.b1 = b1;
	}
	
	public boolean getB2()
	{
		return b2;
	}
	
	public void setB2(boolean b2) {
		this.b1 = b2;
	}
	
	public boolean getB3()
	{
		return b3;
	}
	
	public void setB3(boolean b3) {
		this.b3 = b3;
	}
	
	public boolean countBoolean() 
	{
		int count = 0;
		
		if(b1) 
		{
			count++;
		}
		if(b2) 
		{
			count++;
		}
		if(b3) {
			count++;
		}
		
		if(count > 1)
			return true;
		else
			return false;
		
		
	}

	

}
