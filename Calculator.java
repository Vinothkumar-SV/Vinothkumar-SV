package week1day2;

public class Calculator {

	public void add(int num1,int num2) {
		// TODO Auto-generated method stub
		System.out.println(num1 + num2);

	}
	public void sub(float num3,int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num3-num1-num2);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj =new Calculator();
		obj.add(4,3);
		obj.sub(9f,8,5);

	}

}
