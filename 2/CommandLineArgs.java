import java.io.*;

public class CommandLineArgs
{
	public static void main (String args[])
	{
		int x1 = Integer.parseInt(args[0]);
		int x2 = Integer.parseInt(args[1]);

		int sum = x1 + x2;
		int diff = x1 -  x2;
		int product = x1 * x2;
		int quotient = x1 / x2;
		int remainder = x1 % x2;

		System.out.println( "The Given Numbers are " + x1 + " & " + x2 );
		System.out.println("Sum is "+ sum);
		System.out.println("Difference is "+ diff);
		System.out.println("Product is "+ product);
		System.out.println("Quotient is "+ quotient);
		System.out.println("Remainder is "+ remainder);
	}	
}
