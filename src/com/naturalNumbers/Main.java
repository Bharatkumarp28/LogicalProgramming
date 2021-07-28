package com.naturalNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Getting user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending number : ");
		int end = sc.nextInt();
		sc.close();
		
		//Calling the method
		String output =  NaturalNumbers.getNaturalNumbers(start, end);
		//Printing the output
		System.out.println(output);
		
		
		

	}

}
