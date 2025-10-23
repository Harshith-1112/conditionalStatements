package com.codegnan.conditionstatements;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		double balance=10000;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter withdraw Amount ");
		double withdrawAmount=scanner.nextDouble();
		if(withdrawAmount<=balance) {
			balance-=withdrawAmount;
			System.out.println("Withdrawl succesfull. Remaing balance is "+ balance);
		}else {
			System.out.println("Insufficient Funds");
		}

	}

}
