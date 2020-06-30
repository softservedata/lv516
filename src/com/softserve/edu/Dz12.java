package com.softserve.edu;

import java.util.Scanner;

public class Dz12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.print("Where are you live, " + name + "?");
		String adress = sc.nextLine();
		System.out.println(name + " lives in " + adress + "?");
		}
}
