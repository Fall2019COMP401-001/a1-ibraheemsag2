package a1;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

// Got decimal place rounding from here https://www.mkyong.com/java/java-display-double-in-2-decimal-points/

public class A1Adept {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//comment
		// Your code follows here.
		int num = scan.nextInt();
		
		// stores products and their prices
		String[] prod = new String[num];
		double [] price = new double[num];
		
		for (int i = 0; i < num; i++)
		{
			prod[i] = scan.next();
			price[i] = scan.nextDouble();
			
			
		}
		
		// creates array with customer names 
		int num2 = scan.nextInt();
		String[] first = new String [num2];
		String[]last = new String [num2];
		// total money paid
		double [] total = new double [num2];
		//number of items in cart
		int cart = 0;
		//name of items
		String item = " ";
		// number of items
		int quantity = 0;
		
		for(int i = 0; i < num2; i++)
		{
		first[i] = scan.next();
		last[i] = scan.next();
		cart = scan.nextInt();
			for(int n = 0; n < cart; n++)
			{
			quantity = scan.nextInt();
			item = scan.next();
				for(int q = 0; q < num; q++)
				{
					if (item.equals(prod[q]))
					{
						total[i] += quantity * price[q];
					}
				}
			}
		}
		int largest = 0;
		int smallest = 0;
	for (int p = 0; p < num2; p++) {
		if (total[p] > total[largest] )
		{
			largest = p;
		}
		
	}
	for(int l = 0; l < num2; l++)
	{
		if(total [l] < total [smallest])
		{
			smallest = l;
		}
	}
	double average = 0;
	for (int a = 0; a < num2; a++)
	{
		average += total [a];
	}
		average = average/num2;
		System.out.println("Biggest: " + first [largest] +" " + last[largest] + " (" + total [largest] + ")" );
		System.out.println("Smallest: " + first [smallest] + " " + last[smallest] + " (" + total [smallest] +")");
		System.out.println("Average: (" + df2.format(average) + ")");
	}
	
}