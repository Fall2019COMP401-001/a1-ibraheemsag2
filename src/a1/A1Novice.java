package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here
		
		// Finds the number of customers
		int cust = scan.nextInt();
		
		// create an array of customer first names and last names.
		
		String [] first = new String [cust];
		String [] last = new String [cust];
		// array that stores the money spent by each customer
		double[] value = new double[cust];
		//create a variable that stores number of items
		
		int items = 0;
		
		for( int i = 0; i < cust; i++) {
		first [i] = scan.next();
		
		last [i] = scan.next();
		
		items = scan.nextInt();
		value [i] = value (items);
		
		}
		
		for (int i = 0; i < cust; i++)
		{
			System.out.println( first [i].charAt(0)+ ". "  + last[i]+" " +  value[i]  );
		}
		scan.close();
	}
	public static double value (int length)
	{
		//comment
		double value = 0;
		int quantity = 0;
		double price = 0;
		Scanner scan2 = new Scanner(System.in);
		for(int i = 0; i < length; i++)
		{
			//finds value of all items
			quantity = scan2.nextInt();
			scan2.next();
			price = scan2.nextDouble();
			value += quantity * price;
			
		}
		
		return value;
	}
}
