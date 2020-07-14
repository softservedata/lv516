package homework3;
//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)

import java.util.Scanner;

enum Conts {
	ASIA, AFRICA, AUSTRALIA, NORTH_AMERICA, SOUTH_AMERICA, EUROPE
}

public class Continents {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the country");
		String country = sc.nextLine();

		switch (country) {
		case "China":
		case "Nepal":
		case "Pakistan":
		case "Bangladesh":
			System.out.println(Conts.ASIA);
			break;
		case "Libya":
		case "Mali":
		case "Niger":
		case "Tunisia":
			System.out.println(Conts.AFRICA);
			break;
		case "Australia":
		case "Indonesia":
			System.out.println(Conts.AUSTRALIA);
			break;
		case "Canada":
		case "USA":
			System.out.println(Conts.NORTH_AMERICA);
			break;
		case "Argentina":
		case "Bolivia":
		case "Colombia":
		case "Peru":
			System.out.println(Conts.SOUTH_AMERICA);
			break;
		case "Ukraine":
		case "Poland":
		case "Italy":
		case "England":
			System.out.println(Conts.EUROPE);
			break;
		default:
			System.out.println("Another");
			break;

		}
		sc.close();
	}
}
