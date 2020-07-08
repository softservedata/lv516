package com.softserve.homework2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int birthdYear;
	private int year;

	public Person() {
	    firstName = "";
	    lastName = "";
	    birthdYear = 1900;
	    year = LocalDate.now().getYear();
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		birthdYear = 1900;
		year = LocalDate.now().getYear();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthdYear() {
		return birthdYear;
	}

	public void setBirthdYear(int birthdYear) {
		this.birthdYear = birthdYear;
	}

	
	public int getAge() {
	    return year - birthdYear;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName 
		        + ", was born " + getBirthdYear() 
		        + " - " + getAge() + " years.";
	}

    public void changeName(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }
    
    public void output() {
        System.out.println(toString());
    }
	   
	public static Person input() { // Static Factory Pattern
		Scanner sc = new Scanner(System.in);
		System.out.print("Firstname = ");
		String firstname = sc.nextLine();
		System.out.print("Lastname = ");
		String lastname = sc.nextLine();
		System.out.print("birthdYear = ");
		int birthdYear = sc.nextInt();
		Person person = new Person(firstname, lastname);
		person.setBirthdYear(birthdYear);
		return person;
	}

}