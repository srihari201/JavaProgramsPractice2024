package day3Practice;

public class SwapTwoNumberWIthoutThirdVariable {
	public static void main(String args[]) {
		
		if(args.length<2) {
			return;
		}
		
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		System.out.println("Numeber1 is" + number1);
		System.out.println("Number2 is" + number2);
		System.out.println("Before swapping " + "number1:"+number1 + " number2:"+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After swapping " + "number1:"+number1 + " number2:"+number2);
		
	}

}
