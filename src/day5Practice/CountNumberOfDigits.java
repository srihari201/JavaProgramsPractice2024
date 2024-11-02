package day5Practice;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		long number = 8907565656l;
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);
	}

}
