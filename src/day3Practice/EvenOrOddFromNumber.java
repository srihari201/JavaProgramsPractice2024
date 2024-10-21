package day3Practice;

public class EvenOrOddFromNumber {
	int number = 234567;

	public static void main(String[] args) {
		EvenOrOddFromNumber ref = new EvenOrOddFromNumber();
		System.out.println(ref.number);
		while (ref.number > 0) {
			int digit = ref.number % 10;
			if (digit % 2 == 0) {
				System.out.println(digit + "is even");

			} else {
				System.out.println(digit + "is odd");
			}

			ref.number = ref.number / 10;

		}

	}

}
