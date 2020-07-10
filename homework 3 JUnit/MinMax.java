package homework3;

public class MinMax {

	public static int largest(int first, int second, int third) {
		int max = first;
		if (second > max) {
			max = second;
		}
		if (third > max) {
			max = third;
		}
		return max;
	}

	
	public static int smallest(int first, int second, int third) {
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
