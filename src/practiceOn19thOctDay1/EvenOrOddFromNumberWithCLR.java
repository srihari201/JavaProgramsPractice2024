package practiceOn19thOctDay1;

public class EvenOrOddFromNumberWithCLR {
	public static void main(String[] args) {
		Long number = Long.parseLong(args[0]);
		System.out.println("Number is " + number);
		while (number > 0) {
			Long digit = number % 10;
			System.out.println(digit);
			if (digit % 2 == 0) {
				System.out.println(digit + "is even");
			} else {
				System.out.println(digit + "is odd");
			}
			number=number/10;

		}

	}

}
