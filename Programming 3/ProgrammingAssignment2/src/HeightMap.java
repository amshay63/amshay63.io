/**
 * Adam Shay
 * CIT260 Sec. 25
 * 2/13/2019 
 * This class holds two methods
 * 
 * The first method sorts a one-dimensional array
 * The second method prints out 5 heights and coordinates 
 */
public class HeightMap {
	
	/** Methods **/
	/** Sort Array **/
	public static void sortArray(int[] array) {
		boolean swap = true;
		int temp;
		int counter = 0;
		
		while(swap) {
			swap = false;
			for(int i = 0; i < array.length-1 - counter; i++) {
				if(array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swap = true;
				}
			}
			counter++;
		}
	}
	/** Print Heights and Coordinates **/
	public static void printOut(int[] heights, String[] coords) {
		System.out.println("The Top 5 Highest Points Are:");
		System.out.printf("%15s%20s\n", "Height", "Coordinates");
		for(int i = 0; i < 5; i++) { 
			System.out.printf("%15s%20s\n", heights[i], coords[i]);
		}
		System.out.println();
	}
}
