/*
 * PROJECT : wish message display depending on system time.
 * VERSION : 1.0
 * DATE : 18.june.2019
 * AUTHOR:  Team S.
*/

package com.sr.beans;

import java.util.Date;

public class WishMessageGenerator {
	// Date is the dependent class
	private Date date = null;

	static {
		System.out.println("WishMessageGenerator  static block");
	}

	// Check no param Constructor Execution
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	// Get the system date and make it publically accessable
	public void setDate(Date date) {
		this.date = date;
	}

	public String generateMessage(String user) {
		int hour;

		// get date in 24 hour format through Date class obj
		// getHours()------->depricated
		hour = date.getHours();

		// execute case as per current time
		if (hour < 12)
			return ("Good Morning..:" + user);
		if (hour < 18)
			return ("Good Afternoon..:" + user);
		if (hour < 24)
			return ("Good Evening..:" + user);
		else
			return ("Good Night..:" + user);

	}
}
