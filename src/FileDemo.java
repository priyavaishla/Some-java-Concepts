import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileDemo {

	public static void main(String[] args) throws IOException {
	/*//File f1= new File("D:\\New folder\\priyanka.txt");
	System.out.println(f1.createNewFile());
	System.out.println(f1.canRead());
	System.out.println(f1.canWrite());
	System.out.println(f1.exists());
	System.out.println(f1.length());*/
	
	//FileWriter fw= new FileWriter(f1,true); 
	BufferedWriter bw= new BufferedWriter(new FileWriter("D:\\New folder\\priyanka.txt",false));
	System.out.println("writing complete");
	bw.write("priyanka singh");
	//BufferedWriter bf= new BufferedWriter(new FileWriter("D:\\harry.txt",true));
	bw.close();
	
	
	BufferedReader br= new BufferedReader(new FileReader("D:\\New folder\\priyanka.txt"));
	int x;
	/* do{
		 x=br.read();
		 if(x!=-1)
			 System.out.println((char)x);
		 }
		 while(x!=-1);
		 br.close();
		}*/
	
	do{
		x=br.read();
		if(x!=-1)
			System.out.print((char)x);
	}
	while(x!=-1);
	br.close();
	}
	
	
	
	}

