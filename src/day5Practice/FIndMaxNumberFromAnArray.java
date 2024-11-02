package day5Practice;

public class FIndMaxNumberFromAnArray {
	public static void main(String[] args) {
		int a[] = { 12, 34, 56 };
		int totalLength = a.length;
		System.out.println("Total Length of an array: " + totalLength);
		int max = a[0];
		for (int i = 0; i < totalLength; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
