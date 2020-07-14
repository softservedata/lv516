package homework3;

import java.util.Scanner;

//Enter the number of the day of the week. Display the name in three languages.

public class Week {
	public static void main(String[] args) {

		System.out.println("Type the number of the week");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("понед≥лок, Monday, Lundi");
			break;
		case 2:
			System.out.println("в≥второк, Tuesday, Mardi");
			break;
		case 3:
			System.out.println("середа, Wednesday, Mercredi");
			break;
		case 4:
			System.out.println("четвер, Thursday, Jeudi");
			break;
		case 5:
			System.out.println("п'€тниц€, Friday, Vendredi");
			break;
		case 6:
			System.out.println("субота, Saturday, Samedi");
			break;
		case 7:
			System.out.println("нед≥л€, Sunday, Dimanche");
			break;
		default:
			System.out.println("enter 1 - 7");
			break;

		}
		sc.close();

	}

}
