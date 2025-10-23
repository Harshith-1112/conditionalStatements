package com.codegnan.conditionstatements;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		/*
		 1234
		 number>=10 
		 digitSum=0; 
		 lastDigit=number%10-->1234%10-->4
		 digitSum=
		 */
		
		while (number >= 10) { // if number has more than one single digit
			int digitSum = 0; // variable to stoore the sum of digits for this round
			while (number > 0) { // extract and sum all digits of the current number
				int lastDigit = number % 10; // get the lastDigit
				digitSum += lastDigit; // add it to the running total
				number = number / 10; // remove the last digit
			}
			// after summing all digits, set numbers to the new sum
			// and repeat if it still has more than one digit
			number = digitSum;
		}
		// when the number becomes a single digit print the result
		System.out.println(number);
	}

}
