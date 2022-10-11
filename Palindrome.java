package Week3.day1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           java.lang.String name="yaswanth";
           java.lang.String rev= "";
          
           for (int i = name.length()-1; i >= 0; i--) {
        	  //
        	   
			rev=rev+name.charAt(i);
           }
			if(name.equals(rev)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			
		
           System.out.println(rev);
	}

}