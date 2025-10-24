package com.codegnan.conditionstatements;

public class SwitchExamples {

	public static void main(String[] args) {
		byte a=97;
		switch(a+1) {
		case 97:
		System.out.println();
		
		case 20:
			System.out.println("10");
		
		case 1000:
			System.out.println("1000");
			break;
			default:
				System.out.println("Invalid choice");
		
	/*	final byte a=10;
		switch(a+1) {
		case 1+10+20:
		System.out.println();
		break;
		case a:
			System.out.println("10");
			break;
		case 1000:
			System.out.println("1000");
			break;  */
		}

	}

}
