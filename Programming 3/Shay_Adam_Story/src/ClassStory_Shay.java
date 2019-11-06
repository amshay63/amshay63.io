//Class for Story
import java.util.*;

public class ClassStory_Shay
{
	//Constructor
	public ClassStory_Shay()
	{
		
	}
	
	//Attributes 
	private String firstNoun;
	private String secondNoun;
	private String thirdNoun;
	private String firstVerb;
	private String secondVerb;
	private String thirdVerb;
	private String firstAdj;
	private String secondAdj;
	private String thirdAdj;
	private int charTotal;
	
	//Set Method to Prompt User for Nouns, Verbs, and Adjectives
	public void GetInput()
	{
		Scanner input;
		System.out.print("Enter a Noun.");
		input = new Scanner(System.in);
		firstNoun = input.nextLine();
		System.out.print("Enter a Noun. (Location)");
		secondNoun = input.nextLine();
		System.out.print("Enter a Noun.");
		thirdNoun = input.nextLine();
		System.out.print("Enter a Verb.(Past-Tense)");
		firstVerb = input.nextLine();
		System.out.print("Enter a Verb.(Past-Tense)");
		secondVerb = input.nextLine();
		System.out.print("Enter a Verb.(Past-Tense)");
		thirdVerb = input.nextLine();
		System.out.print("Enter an Adjective.");
		firstAdj = input.nextLine();
		System.out.print("Enter an Adjective.");
		secondAdj = input.nextLine();
		System.out.print("Enter an Adjective.");
		thirdAdj = input.nextLine();
		input.close();
	}
	//Set Method to Calculate the Number of Total Characters Input by the User
	public void GetLength()
	{
		charTotal = (firstNoun.length() + secondNoun.length() + thirdNoun.length() + firstVerb.length() + secondVerb.length() + thirdVerb.length() + firstAdj.length() + secondAdj.length() + thirdAdj.length());		
	}
	//Set Method to Display Total Characters
	public void DisplayLength()
	{
		System.out.println("Total Characters:" + charTotal);
	}
	//Set Method to Print out Story
	public void GetStory()
	{
		System.out.println("-MadLibs-");
		System.out.println("I " + firstVerb + " my " + firstAdj + " pet " + firstNoun + " to the " + thirdAdj + " " + secondNoun + ".");
		System.out.println("We " + secondVerb + " and " + thirdVerb + " with the " + secondAdj + " " + thirdNoun + " all day.");
	}
}