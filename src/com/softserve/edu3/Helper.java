package com.softserve.edu3;

public class Helper {
	private static String message;

	private Helper() {
	}

	public static void setMessage(String message) {
		Helper.message = message;
	}

	public static void print() {
		System.out.println(message);
	}
}
