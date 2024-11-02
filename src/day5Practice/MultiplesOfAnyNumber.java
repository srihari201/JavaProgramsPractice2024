package day5Practice;

import java.util.Scanner;

public class MultiplesOfAnyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the factor1:");
		int factor1 = scanner.nextInt();
		System.out.println("Enter the Limit:");
		int limit = scanner.nextInt();
		for (int i = 0; i <= limit; i++) {
			System.out.println(factor1 * i);

		}
		scanner.close();

	}

}
