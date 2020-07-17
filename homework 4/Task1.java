package homework5;

import java.util.Scanner;

//Ask user to enter the number of month. 
//Read the value and write the amount of days in this month 
//(create array with amount days of each month).

class Month {

	int number;

	private int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the number of month.");
		number = sc.nextInt();
		sc.close();
	}

	public void output(int number) {
		for (int i = 0; i < month.length; i++) {
			if (number == i + 1)
				System.out.println("Amount of days in this month\n" + month[i]);
		}
	}
}

public class Task1 {
	public static void main(String[] args) {

		Month month = new Month();
		month.input();
		month.output(month.number);

	}

}
