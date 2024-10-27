package day5Practice;

public class SumOfEvenOrOdd {
	public static void main(String[] args) {
		int limit = 10;
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i; //sumEven+=i;
			} else {
				sumOdd = sumOdd + i;//sumOdd+=i;
			}
		}
		System.out.println("Sum of even numbers: " + sumEven);
		System.out.println("Sum of odd numbers: " + sumOdd);

	}

}
