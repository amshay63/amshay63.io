import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RaceTrack{

	final static int[] distance = {10, 5, 10};

	public static void main(String[] args) throws IOException {
		
		DecimalFormat cutOff = new DecimalFormat("00");

		//Initialize Variables
		int r, g, b, maxspeed, numCars;
		String line;
		String[] lineArray;
		int counter = 0;
	
		
		//Initialize File "racecars" and Scanner in File
		File myFile = new File("racecars.txt");
		Scanner read = new Scanner(myFile);
		
		//Read File for Number of Cars and Get Ready to Read File
		numCars = read.nextInt();
		read.nextLine();
		
		//Initialize Array with Enough
		Car[] raceCar = new Car[numCars];
		
		//Read File Into Constructor And Create Cars
		for(int i = 0; i < numCars; i++) {
			line = read.nextLine();
			lineArray = line.split(",");

			String name = lineArray[0];
			r = Integer.parseInt(lineArray[1]);
			g = Integer.parseInt(lineArray[2]);
			b = Integer.parseInt(lineArray[3]);
			Color color = new Color(r, g, b);
			maxspeed = Integer.parseInt(lineArray[4]);
			String driver = lineArray[5];
			
			raceCar[counter] = new Car(name, 0 ,color, maxspeed, driver);
			counter++;
			}

		double[] time1 = new double[numCars]; 
		double[] time2 = new double[numCars];
		double[] time3 = new double[numCars];
		double[] raceTime = new double[numCars];
		
		
		for(int count = 0; count < numCars; count++) {
			
			//accelerate the car 5 times in leg 1
			for(int i = 0; i < 5; i++) 
				raceCar[count].accelerate();
			
			time1[count] = (double)distance[0] / raceCar[count].getSpeed(); 
			
			//decelerate 2 times at turn 1
			for(int i = 0; i < 2; i++)
				raceCar[count].decelerate();
			
			//accelerate the car 3 times in leg 2
			for(int i = 0; i < 3; i++)
				raceCar[count].accelerate();
			
			time2[count] = (double)distance[1] / raceCar[count].getSpeed(); 
			
			//decelerate 3 times at turn 2
			for(int i = 0; i < 3; i++)
				raceCar[count].decelerate();
			
			//accelerate the car 5 times in leg 3
			for(int i = 0; i < 5; i++)
				raceCar[count].accelerate();
			

			time3[count] = (double)distance[2] / raceCar[count].getSpeed(); 
			
		}
		
		for(int i = 0; i < numCars; i++)
			raceTime[i] = time1[i] + time2[i] + time3[i];
		
	//testing times
		for(int i = 0; i < numCars; i++) {
			System.out.printf("%-30s%s\n", raceCar[i].getName(), raceTime[i]);
		}
			
		
		//determine who has won
		String carWinner = "";
		double timeWinner = 999999;
		String driverWinner = "";
		
		for(int i = 0; i < raceTime.length; i++) {
			if (raceTime[i] < timeWinner) { //Determine the Smallest raceTime in the Array
				timeWinner = raceTime[i];
				carWinner = raceCar[i].getName();
				driverWinner = raceCar[i].getDriver();
			}	
		}
		double seconds = (timeWinner * 3600); //Convert Time(Hours) to Seconds
		double minutes = (seconds / 60) ; //Convert Seconds to Minutes
		double secondsLeft = seconds % 60; //Calculate the Remaining Minutes into Seconds
		//Print Race Results
		 System.out.println();
		 System.out.println("---------------------------Race-Results----------------------------------");
		 System.out.println("-------------------------------------------------------------------------");
		 System.out.printf("%10s%25s%30s", "Driver", "Car", "Time");
		 System.out.println();
		 System.out.println("-------------------------------------------------------------------------");
		 System.out.format("%10s%30s%25s:%s:%s\n", driverWinner, carWinner, "00", cutOff.format(minutes), cutOff.format(secondsLeft));
		 System.out.println("-------------------------------------------------------------------------");
	
	}
}

