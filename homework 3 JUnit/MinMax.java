package homework3;

import java.util.Scanner;

public class MinMax {

	private int first;
	private int second;
	private int third;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	public MinMax(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;

	}

	public static MinMax input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number :");
		int first = scanner.nextInt();
		System.out.println("enter second number :");
		int second = scanner.nextInt();
		System.out.println("enter third number :");
		int third = scanner.nextInt();
		MinMax minmax = new MinMax(first, second, third);
		minmax.largest();
		minmax.smallest();
		scanner.close();
		return minmax;
	}

	public void output() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "the largest of three numbers " + getFirst() + ", " + getSecond() + ", " + getThird() + ", " + " is: "
				+ largest() + "\nthe smallest is " + smallest();
	}

	public int largest() {
		int max = first;
		if (second > max) {
			max = second;
		}
		if (third > max) {
			max = third;
		}
		return max;
	}

	public int smallest() {
		int min = first;
		if (second < min) {
			min = second;
		}
		if (third < min) {
			min = third;
		}
		return min;
	}

}
