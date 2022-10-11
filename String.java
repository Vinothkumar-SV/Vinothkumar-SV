package Week3.day1;

import org.apache.commons.math3.analysis.function.Asin;

public class String {

	public String(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		 java.lang.String companyName="TestLeaf";//A-65 a-97
	        java.lang.String name="TestLeaf";
	        //String object
	        java.lang.String company=new String("TestLeaf");
	        //compare the string reference(memory)
	        if(companyName==name) {
	            System.out.println("True");
	        }
	        else {
	            System.out.println("False");
	        }
	        //equals()-->to compare the string content
	        //equalsIgnoreCase--case
	        if(companyName.equalsIgnoreCase(company)) {
	            System.out.println("Equal");
	}
	        else {
	            System.out.println("Not Equal");
	        
	}
	        //length()--->to find how many char---int
	        int length = companyName.length();//8
	        System.out.println(length);
	        //contains()--compare the string with matching content--->boolean
	         boolean var = companyName.contains("No records");
	         System.out.println(var);
	        //convert my string into charArray--->char[]
	         char[] charArray = companyName.toCharArray();//"TesT Leaf" T,e,s,...
	         System.out.println(charArray);
	         //indexOf('T')-->position of the given char  int
	         int aws;
			int help;
			 //indexOf('T')-->position of the given char  int
	         int indexOf = companyName.indexOf('L');
	         System.out.println(indexOf);
	         //charAt(i)--->char available in the given position
	         char charAt = companyName.charAt(6);
	         System.out.println(charAt);
	        
     
	}

	char[] toCharArray() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean contains(java.lang.String string) {
		// TODO Auto-generated method stub
		return false;
	}

	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int indexOf(char c) {
		// TODO Auto-generated method stub
		return 0;
	}

	private char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
