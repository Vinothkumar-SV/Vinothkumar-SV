package week1day2;

import java.util.Arrays;

public class SmalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {23,45,67,32,89,22};
		
		Arrays.sort(arr);
		System.out.println("Sorted array "+Arrays.toString(arr));
		int small = arr[0];
		System.out.println("Smallest number is "+small);
		
		
	}

}
