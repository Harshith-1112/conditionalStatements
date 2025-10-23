package com.codegnan.conditionstatements;

public class TicketPrice {

	public static void main(String[] args) {
		String passengerType="adult"; // child, adult, senior
		String bookingTime="early"; // early, normal, last-minute
		boolean isMember=true;
		double basePrice=5000;
		
		// passenger type discount.
		if(passengerType.equalsIgnoreCase("child")) {
			basePrice *= 0.5;
		}else {
			if (passengerType.equalsIgnoreCase("senior")) {
				basePrice *=0.8;
			}else {
				if(passengerType.equalsIgnoreCase("adult")) {
					// no discount
				}else {
					System.out.println("Invalid passenger type");
					return;
				}
			}
		}
		// booking time adjustment
		if(bookingTime.equalsIgnoreCase("early")) {
			basePrice*=0.9;
		}else {
			if(bookingTime.equalsIgnoreCase("normal")) {
				// no change
			}else {
				if(bookingTime.equalsIgnoreCase("last-minute")) {
					basePrice*=1.2;
				}else {
					System.out.println("invalid bookingtime");
					return;
				}
			}
		}
		// 4500 ==>5% 0f 4500-->225 4500-225
		// member discount
		if(isMember) {
			basePrice*=0.95;
		}
		System.out.println("Final Ticket Price : "+basePrice);
	}

}
