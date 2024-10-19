package practiceOn19thOctDay1;

public class EvenOrdOddWithCLR {
	public static void main(String args[]) {
		System.out.println("Execution will start from main method ");
		if (args.length < 2) {
			return;
		}

		int number = Integer.parseInt(args[2]);
		if (number % 2 == 0) {
			System.out.println(number + "is even ");
		} else {
			System.out.println(number + "is odd");
		}
		System.out.println("Execution will be ended");
	}
}
