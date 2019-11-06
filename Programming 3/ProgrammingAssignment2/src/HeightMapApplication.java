/**
 * Adam Shay
 * CIT260 Sec. 25
 * 2/13/2019 
 * This program will read data from a height map file.
 * 
 * The data will be put into both a two-dimensional AND a one-dimensional array.
 * The one-dimensional array will be used to sort the values from least to greatest.
 * The two-dimensional array will be used to find the coordinates of each value.
 *
 * This program will output the top five highest and lowest points on the map along with their coordinates.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HeightMapApplication {

	public static void main(String[] args) throws IOException {
		 
		/**Initialize File and Scanner in File**/
		File myFile = new File("terrain.dat");
		Scanner read = new Scanner(myFile);
		
		/**Find Range of Data**/
		String range = read.nextLine();
		StringTokenizer st = new StringTokenizer(range, " \t()?.,;");
		
		int rows = Integer.parseInt(st.nextToken());
		int cols = Integer.parseInt(st.nextToken());
		
		/**Initialize 3 Arrays**/
		int[][] height2DArray = new int[rows][cols]; 
		int[] height1DArray = new int[rows*cols];
		
		
		/**Read File into Two-Dimensional Array**/
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				height2DArray[r][c] = read.nextInt();
			}
		}
		/**Fill 1D Array**/
		int counter = 0;
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				height1DArray[counter] = height2DArray[r][c];
				counter++;
			}
		}
		
		/**Sort 1DArray**/
		HeightMap.sortArray(height1DArray);
		
		/**Initialize High/Low Arrays**/
		int[] highestHeights = new int[5];
		String[] highestCoords = new String[5];
		int[] lowestHeights = new int[5];
		String[] lowestCoords = new String[5];
		
		/**Set Lowest 5 Heights and Coordinates**/
		for(int i = 0; i < 5; i++) { 
			lowestHeights[i] = height1DArray[i];
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					if (height2DArray[r][c] == lowestHeights[i])
					{
						lowestCoords[i] = "(" + c + ", " + r + ")";
					}
				}
			}
		}
		
		/**Set Highest 5 Heights and Coordinates**/
		counter = 0;
		for(int i = (height1DArray.length - 1); i > (height1DArray.length - 6); i--) { 
			highestHeights[counter] = height1DArray[i];
			
			for(int r = 0; r < rows; r++) {
				for(int c = 0; c < cols; c++) {
					if (height2DArray[r][c] == highestHeights[counter])
					{
						highestCoords[counter] = "(" + c + ", " + r + ")";
					}
				}
			}
			counter++;
		}
		
		/**Output**/
		/**Print First 5 Heights and Coordinates**/
		HeightMap.printOut(highestHeights, highestCoords);
			
		/**Print First 5 Heights and Coordinates**/
		HeightMap.printOut(lowestHeights, lowestCoords);
	}
	
}


