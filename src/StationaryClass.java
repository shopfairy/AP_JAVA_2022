
public class StationaryClass {
	
	public String make;
	public int numberOfColours;
	public Boolean	ballPoint;
	public double size;
	
	//no-argument constructor 
	public StationaryClass() {	
		
		this.make = "";
		this.numberOfColours = 0;
		this.ballPoint = false;
		this.size = 0.0;	
		//this("", 0, false, 0.0);
	}
	
	//2 arguments constructor
	public StationaryClass(String make, int numberOfColours) {
		this.make = make;
		this.numberOfColours = numberOfColours;
	}
	
	//4 arguments constructor
	public StationaryClass(String make, int numberOfColours, Boolean ballPoint, double size) {
		this.make = make;
		this.numberOfColours = numberOfColours;
		this.ballPoint = ballPoint;
		this.size = size;	
    	System.out.println(make + " has " + numberOfColours + " colours"+"("+size+"mm) ");
	}
	
	public void isBallPiint() {
		if(ballPoint) {
			System.out.println("This is a ballpoint pen\n");
		}
	}

}
