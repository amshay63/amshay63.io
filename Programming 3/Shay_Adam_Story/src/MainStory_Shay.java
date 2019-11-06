/*CIT160 - Assignment 2
Adam Shay
9/28/18
This program is used to prompt the user to enter words
that are then to be used to construct a short story.
After the user inputs their words, this program 
calculates how many characters were entered in total.
The total value is then displayed after the story in the console.  
*/

public class MainStory_Shay
{
	public static void main(String[]args)
	{
	//Create New Object
		ClassStory_Shay story = new ClassStory_Shay();
		
	//Class Methods
		System.out.println("-----------------------------------------------------");

		story.GetInput(); //Method to Prompt User for Nouns, Verbs, and Adjectives
		story.GetLength(); //Method to Calculate the Number of Total Characters Input by the User
		System.out.println("-----------------------------------------------------");

		story.GetStory(); //Method to Print out Story
		System.out.println("-----------------------------------------------------");
		story.DisplayLength(); //Method to Display Total Characters
		System.out.println("-----------------------------------------------------");

	}
}