/**
 * Adam Shay
 * CIT260 Sec. 25
 * 3/30/2019 
 * 
 * This program will read an input file (Alice in Wonderland) into an Array List
 * 
 * Duplicates, punctuation, digits, words less than 4 letters, and predefined "stop words" are removed.
 * 
 * The Array list will be sorted alphabetically.
 * 
 * A word count and average word length will be calculated and printed.
 * 
 * All words will be set to lowercase and printed in pages with 20 rows and 4 columns. 
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TextProcessing {

	public static void main(String[] args) throws IOException {

		/**Initialize File and Scanner in File**/
		File myFile = new File("joker.txt");
		Scanner read = new Scanner(myFile);
		String word = "";
		
		/**Initialize Array List**/
		ArrayList<String> wonderLand = new ArrayList<String>();
		
		/**Read File into Array List**/
		while(read.hasNext()) {	
			
			/**Set Token from File to Lowercase Word Variable**/
			word = (read.next()).toLowerCase();
			
			/**Word Checks**/
			word = wordCheck(word);
			word = stopWords(word);
			word = lengthCheck(word);
			
			/**Add Word to Array List**/
			if (word.length() > 1)
			wonderLand.add(word);
		}	
		/**Close Scanner**/
		read.close();
		
		/**Remove Duplicates**/
		Set<String> set = new HashSet<>(wonderLand);
		wonderLand.clear();
		wonderLand.addAll(set);
	
		/**Sort Alphabetically**/
		Collections.sort(wonderLand);
		
		/**Word Count**/
		double letterTotal = 0;
		int wordTotal = 0;
		
		for (int i = 0; i < wonderLand.size(); i++) {
			if (wonderLand.get(i).length() > 0) { 
				wordTotal++;
				letterTotal += wonderLand.get(i).length();
			}
		}
		
		/**Console Print Out**/
		System.out.printf("Total Number of Words: %d\n", wordTotal);
		System.out.printf("Average Word Length: %.1f ", (letterTotal/wordTotal));
		
		/**Print Out Array List**/
		int pageNum = 1;
		int counter = 0;
		boolean done = false;
		
		while (counter < (wordTotal)) {
			System.out.printf("\nPage %d\n", pageNum);
			pageNum++;
			for(int j = 0; j < 5; j++) {
				for(int k = 0; (k < 4) && (done == false); k++) {
					System.out.printf("%25s", wonderLand.get(counter));
					counter++;
					if (counter == wordTotal) {
						done = true;
					}
				}
				System.out.println();
			}
		}
	}
	
	/**Remove All Punctuation and Numbers**/
	public static String wordCheck(String word) {
		word = word.replaceAll("[^a-z]", "");
		
		return word;
	}
	
	/**Remove Pre-Defined Stop Words**/
	public static String stopWords(String word) {
		String[] stopwords = {
								"i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you","your",
								"yours","yourself","yourselves", "he", "him", "his", "himself","she","her",
								"hers", "herself", "it", "its", "itself", "they", "them", "their", "theirs",
								"themselves", "what","which", "who", "whom", "this", "that","these", "those",
								"am", "is", "are", "was", "were", "be", "been", "being", "have", "has", "had",
								"having", "do", "does", "did", "doing","would", "should","could","ought","i'm",
								"you're", "he's", "she's", "it's", "we're", "they're", "i've","you've", "we've",
								"they've", "i'd", "you'd","he'd","she'd","we'd","they'd","i'll","you'll","he'll",
								"she'll","we'll","they'll","isn't","aren't","wasn't","weren't","hasn't","haven't",
								"hadn't", "doesn't", "don't", "didn't", "won't", "wouldn't", "shan't", "shouldn't",
								"can't", "cannot","couldn't", "mustn't", "let's","that's","who's","what's","here's",
								"there's", "when's","where's", "why's", "how's", "a", "an", "the", "and", "but","if",
								"or","because","as","until","while","of","at", "by","for", "with", "about", "against",
								"between", "into", "through", "during", "before", "after", "above","below","to","from",
								"up","down", "in", "out", "on", "off", "over", "under", "again","further","then","once",
								"here", "there", "when", "where", "why", "how", "all","any", "both", "each","few","more",
								"most","other","some","such","no","nor","not","only","own","same","so","than","too","very"
							  };

		for(int i = 0; i < stopwords.length; i++) {
			if (word.equals(stopwords[i]))
				word = "";
		}
		return word;
	}
	
	/**Remove Words Less Than 4 Letters**/
	public static String lengthCheck(String word) {
		if (word.length() < 4)
		word = "";
		return word;
	}
}

