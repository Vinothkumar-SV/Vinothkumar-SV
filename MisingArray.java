package week1day2;

import java.util.Arrays;

public class MisingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,7,6,8};
		Arrays.sort(num);
		System.out.println("Sorted array "+Arrays.toString(num));
		for(int i = 0;i < num.length;i++) {
			if(num[i]+1 != num[i+1])
			{
				System.out.println(num[i]+1);
			break;
		         
		
			}
	}
	}
	}


