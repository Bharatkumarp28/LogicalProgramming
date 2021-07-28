package com.greatestNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[3];
		
		for(int i =0; i <input.length; i++) 
		{
			System.out.println("Enter " + i +" Number: ");
			input[i] = sc.nextInt();		
		}
		sc.close();
		
		int output = GreatestNumber.getMaxNumber(input);
		System.out.println("Greatest Number is: " + output);

	}

}
