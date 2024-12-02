package day5Practice;

import java.util.*;

public class RemainderOfAnyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dividend:");
		int dividend = scanner.nextInt();
		System.out.println("Enter the divisor:");
		int divisor = scanner.nextInt();

		System.out.println("Remainder of " + dividend + " && " + divisor + " is " + dividend % divisor);

	}

}
