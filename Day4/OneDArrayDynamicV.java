import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OneDArrayDynamicV {

	public static void main(String[] args) throws Exception {
		
		int arr[] = new int[5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		
		// for each loop
		for(int a:arr)
			sum=sum+a;
		
		System.out.println("Sum = "+sum);
	}
}
