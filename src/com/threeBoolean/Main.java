package com.threeBoolean;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Defining variables
		boolean b1,b2,b3;
		
		//Getting values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first boolean value");
		b1 = sc.nextBoolean();
		System.out.println("Enter first boolean value");
		b2 = sc.nextBoolean();
		System.out.println("Enter first boolean value");
		b3 = sc.nextBoolean();
		sc.close();
		
		//Calling the method
		ThreeBoolean obj = new ThreeBoolean(b1,b2,b3);
		//obj.setB2(false);
		//Printing the output
		System.out.println("Result : " + obj.countBoolean());

	}

}
