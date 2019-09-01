package a1;

import java.util.Scanner;

public class A1Jedi {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

		// Your code follows here.
		
		// stores number of items
		int num = scan.nextInt();
		String [] food = new String[num];
		// number of items bought
		int [] quant = new int [num];
		// number of people who bought it
		int [] times = new int [num];
		// Stores whether person bought it or not.
		boolean [] bought = new boolean [num];
		// loop that stores input price and name of items
		for (int i = 0; i < num; i++)
		{
			food[i] = scan.next();
			scan.nextDouble();
		}
		
		// number of customers
		int numcust = scan.nextInt();
		int cart = 0;
		// stores value to put in quantity
		int storage = 0;
		String product = " ";
		// runs a loop for every customer
		for(int n = 0; n < numcust; n++)
		{
			// runs for all items available
			for(int a = 0; a < num; a++)
			{
				
				bought [a] = true;
			}
			//scans over names of customers
			scan.next();
			scan.next();
			cart = scan.nextInt();
			
			for(int b = 0; b < cart; b++)
			{
				storage = scan.nextInt();
				product = scan.next();
				for (int c = 0; c < num; c++)
				{
					if(product.equals(food[c]))
					{
						quant[c] += storage;
						if(bought [c])
						{
							times[c] += 1;
						}
					}
				}
			}
		}
		
		for(int d = 0; d< num; d++)
		{
			if(quant[d] == 0)
			{
				System.out.println("No customers bought " + food[d]);
			}
			else
			{
				System.out.println(times[d]+" customers bought" + quant[d] + " " + food[d]);
			}
		}
		
		
		// number of items
	
		
		/*	
		int numprod = scan.nextInt();
		// name of product
		String [] prod = new String[numprod];
		// number of times bought
		int [] times = new int [numprod];
		// number of customers who bought it
		int [] cust = new int [numprod];
		
		product(prod, numprod);
		
		
		
		int numcust = scan.nextInt();
		
		times(prod, numcust, times, numprod, cust);
		
		print(prod, times, cust, numcust);
	}
	// scans products
	public static void product (String [] prod, int num)
	{
		
		
		for (int i = 0; i < num; i++)
		{
			prod [i] = scan.next();
			scan.nextDouble();
		}
	}
	
	// number of times item is bought and how many customers bought it
	public static void times (String [] prod, int numcust, int [] times, int numprod, int [] cust)
	{
		
		// number of items in cart
		int cart = 0;
		// stores number for total times
		int storage = 0;
		// Stores name of item
		String name = " ";
		
		// for every customer
		for (int i = 0; i < numcust; i++)
		{
			
			cart = scan.nextInt();
			
			// For every item in cart stores number bought and name
			for (int n = 0; n < cart; n++)
			{
				storage = scan.nextInt();
				name = scan.next();
				
				// Runs name of product compared to every product name and then adds times and number of customers who bought it.
				for (int q = 0; q < numprod; q++)
				{
					if(name.equals(prod[q]))
							{
							times[q] += storage;
							cust[q] += 1;
							}
				}
			}
		}
	}
	
	public static void print (String [] name, int [] times, int [] cust, int num)
	{
		for (int i = 0; i < num; i++)
		{
			if (times [i] == 0)
			{
				System.out.print("No customers bought " + name[i]);
			}
			else
			{
				System.out.print(cust[i] + " customers bought " + times[i] + " " + name[i]);
			}
		}
		*/
	}
	
}
