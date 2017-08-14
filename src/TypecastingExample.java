
public class TypecastingExample {

	public static void main(String[] args) {
		int x=2;
		double y;
		y=x;
		System.out.println(y);
            // x=y; this shows an error because of  size hence we need to explicit type cast .
        x= (int)y;
        System.out.println(x);
        
	}}

        
        
        
     