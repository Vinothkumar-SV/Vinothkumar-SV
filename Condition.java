package week1day2;

public class Condition {
	public static void main(String[] args) {
		
	
    int age=04;
    if(age>=18) {
        System.out.println("18 eligible for vote");    
    }
    else {
        System.out.println("Not eligible for vote");
    }
    int mark=100;
    if(mark>=80) {
        System.out.println("Grade A");
        if(mark==100)
        	System.out.println("Grade A+");
        
    }
    else if(mark>=35) {
        System.out.println("Grade E");
    }
    else {
        System.out.println("fail");
    }
    
}
}