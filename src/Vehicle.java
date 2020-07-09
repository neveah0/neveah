
public class Vehicle {
	private String brand;
	private String color;
	private double speed=0;
	
	 Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;		
	}
	
	public String getBrand() {
		return this.brand;
	}
    public String getColor() {
    	return this.color;
    }
	void run() {
		System.out.println(getColor()+"的"+getBrand()+"汽车在行驶");
	}

	
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle("benz","black");
		 v.run();
		
	}		

	}

