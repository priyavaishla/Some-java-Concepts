import java.util.Scanner;


public class StringDemo {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		//String a= sc.next();
String a=sc.nextLine();
char[] x=a.toCharArray();
for(int y=0;y<a.length();y++)
	System.out.println(x[y]);
//System.out.println(a);




	}

}
