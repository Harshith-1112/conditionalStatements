package com.codegnan.conditionstatements;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int upperLimit=scanner.nextInt();
		int currentNumber=1;
		int palindromeCount=0;
		
		while(currentNumber<=upperLimit) {
			int originalNumber=currentNumber;
			int numberToReverse=originalNumber;
			int reversedNumber=0;
			
			while(numberToReverse>0) {
				int lastDigit=numberToReverse%10;  // track last digit
				reversedNumber=reversedNumber*10+lastDigit; // append digit
				numberToReverse=numberToReverse/10; // remove lastDigit
			}
			// check if the original and reversednumbers are the same.
			if(originalNumber == reversedNumber) {
				palindromeCount++; // increment the count if palindrome
				
			}
			currentNumber++; // move to the next number
		}
		System.out.println(palindromeCount);
	}

}
