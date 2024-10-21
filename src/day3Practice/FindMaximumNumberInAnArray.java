package day3Practice;

public class FindMaximumNumberInAnArray {
	public static void main(String[] args) {
		int arr[] = { 2, 45, 56, 8,67 };
		int max = arr[0];
		int lengthOfArray = arr.length;
		System.out.println(lengthOfArray);
		for (int i = 0; i < lengthOfArray; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max value is " + max);


	}

}
