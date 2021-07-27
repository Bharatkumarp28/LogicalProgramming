package com.mypackage;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		sc.close();
		
		Palindrome obj = new Palindrome();
		System.out.println(obj.isPalindrome(input));
		
	}
	
	

}
