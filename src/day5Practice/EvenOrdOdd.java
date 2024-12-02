
package day5Practice;

public class EvenOrdOdd {
	public static void main(String args[]) {
		int number = 20;
		int sumEven = 0;
		int sumOdd = 0;
		System.out.println("The given number is: " + number);
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "is even");
				sumEven += i;
				System.out.println();
			} else {
				System.out.println(i + "is odd");
				sumOdd += i;

			}
		}
		System.out.println("sum of even is: " + sumEven);
		System.out.println("sum of Odd is: " + sumOdd);

	}

}
