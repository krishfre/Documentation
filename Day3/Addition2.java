
public class Addition2 {

	public static void main(String[] input) {
		
			String s1=input[0];
			String s2 =input[1];
			
			// converting String type to integer type( type casting )
				int a=	Integer.parseInt(s1);
				int b=  Integer.parseInt(s2);
				
			// converting String type to decimal(float) type ( type casting )
				float c = Float.parseFloat(s1);
				float d = Float.parseFloat(s2);
				
			// converting String type to decimal(double) type ( type casting )
				double e = Double.parseDouble(s1);
				double f = Double.parseDouble(s2);
			
			System.out.println("Sum = "+(a+b));

	}

}
