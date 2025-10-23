package com.codegnan.conditionstatements;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Light state(Green/Yellow/Red)");
		String Lightstate=scanner.next();
		System.out.println("Enter Hour(0-23)");
		int hour=scanner.nextInt();
		boolean isDaytime=(hour >= 6 && hour <=18);
		String action;
		if(Lightstate.equalsIgnoreCase("green")) {
			action="Go";
		}else {
			if(Lightstate.equalsIgnoreCase("red")) {
				action="Stop";
			}else {
				if(Lightstate.equalsIgnoreCase("yellow")) {
					if (isDaytime) {
						action ="slow";
					}else {
						action="stop";
					}
				}else {
					action ="Invalid Light state";
				}
			}
		}
		System.out.println(action);
		scanner.close();
	}

}
