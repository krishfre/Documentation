import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Addition3 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a value");
		String s1 = br.readLine();
		int a=Integer.parseInt(s1);
		
		// int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter b value");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Sum = "+(a+b));
		
		

	}

}
