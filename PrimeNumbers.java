package week1day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 15;
		boolean prime = false;
		for(int i = 2;i <= num/2;i++)
		
		if(num%i == 0) {
			prime = true;
			break;
		}
		if(!prime)
			System.out.println("This is Prime Number " +num);
		else
			System.out.println("This is not a Prime Number " +num );



			   }

}