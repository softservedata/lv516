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
		
		String [] arrayAsia = {"China", "Nepal", "Pakistan", "Bangladesh"};
		String [] arrayAfrica = {"Libya", "Mali", "Niger", "Tunisia"};
		String [] arrayAustralia = {"Australia", "Indonesia"};
		String [] arrayNAmerica = {"Canada", "USA" };
		String [] arraySAmerica = {"Argentina", "Bolivia", "Colombia", "Peru" };
		String [] arrayEurope = {"Ukraine", "Poland", "Italy", "England" };
		
		
		System.out.println("Enter the name of the country");
		String country2 = sc.nextLine();
		
		for (int i = 0; i < arrayAsia.length; i++) {
            if (country2.equalsIgnoreCase(arrayAsia[i])) {
                System.out.println(Conts.ASIA);
            }
            
        }
		for (int i = 0; i < arrayAfrica.length; i++) {
            if (country2.equalsIgnoreCase(arrayAfrica[i])) {
                System.out.println(Conts.AFRICA);
            }
        }
		for (int i = 0; i < arrayAustralia.length; i++) {
            if (country2.equalsIgnoreCase(arrayAustralia[i])) {
                System.out.println(Conts.AUSTRALIA);
            }
        }
		for (int i = 0; i < arrayNAmerica.length; i++) {
            if (country2.equalsIgnoreCase(arrayNAmerica[i])) {
                System.out.println(Conts.NORTH_AMERICA);
            }
        }
		for (int i = 0; i < arraySAmerica.length; i++) {
            if (country2.equalsIgnoreCase(arraySAmerica[i])) {
                System.out.println(Conts.SOUTH_AMERICA);
            }
        }
		for (int i = 0; i < arrayEurope.length; i++) {
            if (country2.equalsIgnoreCase(arrayEurope[i])) {
                System.out.println(Conts.EUROPE);
            } 
        } 
		//System.out.println("Enter the name of the country");???????
		sc.close();
	}
}
