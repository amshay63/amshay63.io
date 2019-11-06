import java.awt.Color;
import java.util.Random;

public class Car {
	
	//data members
	
	private String name;
	private int speed;
	private Color color;
	private int maxSpeed;
	private String driver;
	
	//method members
	
	//constructors
	
	
	/**
	 * This is the full constructor
	 * @param name		will be the name of the Car object
	 * @param speed		will be the speed of the Car object
	 * @param color		will be the color of the Car object
	 * @param maxSpeed	will be the maxSpeed of the Car object
	 * @param driver	will be the name of the driver
	 */
	public Car(String name, int speed, Color color, int maxSpeed, String driver) {
		super();
		this.name = name;
		this.speed = 0;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.driver = driver;
	}

	/**
	 * this is the default constructor. It constructs a black colored
	 * car named Unknown
	 * 
	 */
	public Car() {
		super();
		this.name = "Unknown";
		this.speed = 0;
		this.color = Color.BLACK;
		this.maxSpeed = 0;
		this.driver = "Unknown";
	}
	
	public Car(String name, int maxSpeed) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
		this.color = Color.BLACK;
	}

	
	//getters and setters
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	/**
	 * this method returns the name of the car object 
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * This method resets the name of the car object
	 * 
	 * @param name	will be set as the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name 
				+ ", speed=" + speed 
				+ ", color=" + color 
				+ ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
	

	
	
	
	//other object specific methods
	
	/**
	 * This method increases the speed by a random value
	 * between 5 and 20
	 * 
	 */
	public void accelerate() {
		Random rand = new Random();
		
		speed += (5 + rand.nextInt(16));
		
		if(speed > maxSpeed)
			speed = maxSpeed;
		
	}
	
	
	
	/**
	 * This method decreases the speed by a random value
	 * between 5 and 20
	 * 
	 */
	public void decelerate() {
		Random rand = new Random();
		
		speed -= (5 + rand.nextInt(16));
		
		if(speed < 0)
			speed = 0;
		
	}

}
