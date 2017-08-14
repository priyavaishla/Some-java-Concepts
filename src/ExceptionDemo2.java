import java.util.Scanner;


public class ExceptionDemo2 {

	public static void main(String[] args) {

		int balance =5000;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your withdraw amount");
		int withdrawlAmount=sc.nextInt();
		try{
		if(balance<withdrawlAmount){
			throw new ArithmeticException("no balance in your account");	
		}
		else{
			balance=balance-withdrawlAmount;
			System.out.println("Transaction Complete"); 
		}
		}
		/*catch(ArithmeticException ae){
		System.out.println(ae.getMessage());
		}*/
		finally{
		System.out.println("program continue");
		}
	}

}
