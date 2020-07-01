package com.softserve.edu3;

public class Util {
	
	public void print(String welcomeMessage, Object... messages) {
		System.out.print(welcomeMessage);
		for (Object msg : messages) {
			System.out.print("  " + msg); // msg.toString()
		}
	}
}
