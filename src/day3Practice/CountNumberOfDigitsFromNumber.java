package day3Practice;

public class CountNumberOfDigitsFromNumber {

	public static void main(String[] args) {
int number=89765544;
int count=0;
while(number>0) {
	number=number/10;
	count++;
}
System.out.println(count);
	}

}
