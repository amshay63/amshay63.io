//CIT160 - Assignment 1
import java.text.DecimalFormat;
import java.util.Scanner;

public class Coffee
{
	
	private static Scanner input;
	public static void main(String[]args)
		{
		
		//Formatting
		DecimalFormat currencyUsd = new DecimalFormat("$###,###.00");
		DecimalFormat Units = new DecimalFormat("###,###.00 Units");
		
			input = new Scanner(System.in);
		//Get Input For All Coffee Sizes
			System.out.print("Enter Small Coffee Count for the Week:");
			int smallCoffee = input.nextInt();
			System.out.print("Enter Medium Coffee Count for the Week:");
			int mediumCoffee = input.nextInt();
			System.out.print("Enter Large Coffee Count for the Week:");
			int largeCoffee = input.nextInt();
		//Set Variable For Total Coffee Sold Weekly By Finding Their Sum
			double totalCoffee = (smallCoffee + mediumCoffee + largeCoffee);
		//Display Total Coffee Sold
			System.out.print("Total Coffee Sold for the Week = ");
			System.out.print(Units.format(totalCoffee));
			System.out.print("\n");
			System.out.print("\n");
		//Display Title For Coffee Percentages
			System.out.println("=Coffee %=");
			System.out.print("Small Coffee %: ");
		//Calculate Small Coffee Ratio to Total
			double smallPerc = (100 * (smallCoffee / totalCoffee));
			System.out.print(smallPerc + "%");
			System.out.print("\n");
			System.out.print("Medium Coffee %: ");
		//Calculate Small Coffee Ratio to Total
			System.out.print(100 * (mediumCoffee / totalCoffee)+"%");
			System.out.print("\n");
			System.out.print("Large Coffee %: ");
		//Calculate Small Coffee Ratio to Total
			System.out.print(100 * (largeCoffee / totalCoffee)+"%");
			System.out.print("\n");
			System.out.print("Projected Monthly Sale: ");
			//Calculate Monthly Sales 
			System.out.print(currencyUsd.format(totalCoffee));
			
		}
		
}