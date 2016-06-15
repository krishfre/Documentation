import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Graetest3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a value");
		String s1 = br.readLine();
		int a=Integer.parseInt(s1);
		
		// int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter b value");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter c value");
		int c = Integer.parseInt(br.readLine());
		
		
//		if(a>b) {
//			if(a>c)
//				System.out.println("a is greater ");
//			else
//				System.out.println("c is greater");
//		}
//		else if(b>c)
//			System.out.println(" b is greater");
//		else
//			System.out.println("c is greater");
		
		// using conditional operator
		System.out.println(a>b?((a>c)?a:c):(b>c?b:c)+" is greater");
		
		
		
		
		

	}

}
