import java.util.Scanner;


public class ExceptionHandlingDemo {
	public static void main(String[] args) {
	
	int balance =5000;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your withdraw amount");
	int withdrawlAmount=sc.nextInt();
	if(balance<withdrawlAmount){
		throw new ArithmeticException("no balance");	
	}
	else{
		balance=balance-withdrawlAmount;
		System.out.println("Transaction Complete"); 
	}
	System.out.println("if you want to check your balance please enter your id");
	Scanner se= new Scanner(System.in);
	String id= se.next();
	if(id.equals("priya")){
		System.out.println("your current  Balance is "+balance);
	}
	else{
		System.out.println(" Ooops! your  id  is not match");	
	}
	}
	

	
}
