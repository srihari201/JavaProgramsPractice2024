package day5Practice;

public class SwapTwoNumberWithThirdVariable {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		System.out.println("Before swapping " + number1 + " && " + number2);
		int temp = number2;
		number2 = number1;
		number1 = temp;
		System.out.println("After swapping " + number1 + " && " + number2);

	}

}
