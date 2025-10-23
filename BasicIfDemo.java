package com.codegnan.conditionstatements;

import java.util.Scanner;

public class BasicIfDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=scanner.nextInt();
		// if syntax
		if(number>0) {
			System.out.println("The Number " + number + " is positive");
		}else {	
			System.out.println("The Number " + number + " is negative");
		}
		System.out.println("This statement always executed ");
	}

}
