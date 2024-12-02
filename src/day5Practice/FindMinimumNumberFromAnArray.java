package day5Practice;

public class FindMinimumNumberFromAnArray {
	public static void main(String[] args) {
		int arr[];
		arr = new int[] { 1, 390, 45, 12 };
		int totalLength = arr.length;
		int min = arr[0];
		for (int i = 0; i < totalLength; i++) {

			if (arr[i] <min) {
				min = arr[i];
			}

		}
		System.out.println(min);
	}

}
