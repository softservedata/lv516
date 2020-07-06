package homework2;

import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int birthdYear;
	private int year = 2020;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
		int age = year - birthdYear;
		return age;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", was born " + getBirthdYear() + " - " + getAge() + " years.";
	}

	public String input() {
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		return i;
	}

	public void changeName(String name1) {
		System.out.println(name1);
	}

}

/*-
! Create Console Application project in Java.
! Add class Person to the project.
! Class Person should consist of

! three private fields: firstName, lastName and birthYear (the birthday year) 
! properties for access to these fields
! default constructor and constructor with 2 parameters (first and last names)

methods:
! getAge() - to calculate the age of person
! input() - to input information about person
! output() - to output information about person
! changeName(String fn, String fn) - to change the first name or/and last name of person

In the method main() create 5 objects of Person type and input information about them.

 */
