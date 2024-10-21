package day3Practice;

import java.util.Arrays;

public class FindMinimumValueInAnArray {
	public static void main(String[] args) {
		int arr[]= {3,5,8,68,1,0};
		int min=arr[0];
		int arrayLength=arr.length;
		System.out.println(arrayLength);
		for(int i=0;i<arrayLength;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum value is " + min + " from " + Arrays.toString(arr));
		
	}

}
