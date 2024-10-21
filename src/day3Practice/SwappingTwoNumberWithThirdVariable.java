package day3Practice;
import java.util.*;

public class SwappingTwoNumberWithThirdVariable {
	public static void main(String args[]) {
	Scanner scanner=new Scanner (System.in);
	System.out.println("Enter number1");
	int number1=scanner.nextInt();
	System.out.println("Enter number2");
	int number2=scanner.nextInt();
	System.out.println("Before swapping " + "number1:"+number1 + " number2:"+number2);
	int temp=number1;
	number1=number2;
	number2=temp;			
	System.out.println("After swapping " + "number1:"+number1 + " number2:"+number2);

	

}}
