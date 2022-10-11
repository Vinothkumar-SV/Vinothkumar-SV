package week1day2;

import java.util.Arrays;

public class CompareAndMatchArray {
	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] a1 = {1,2,8,4,9,7};
		Arrays.sort(a);
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));
		for(int i = 0;i <= a.length-1;i++) {
		
		for(int j = 0;j <= a1.length-1;j++) {
		
			if(a[i]==a1[j])
			{
				System.out.println(a[i]);
		    
			}
			
			
	
			
		

	
	}

}}}