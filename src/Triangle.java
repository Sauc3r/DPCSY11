
public class Triangle {
	
	private int sideOne;
	private int sideTwo;
	private int sideThree;
	private double height = Math.sqrt(sideThree/2);
	
	
	//Constructors

	public  Triangle(int sideOne, int sideTwo, int sideThree) {

	}
	
	
	public double getSideOne(){
		return sideOne;
		
		
		
	}
	public double getSideTwo(){
		return sideTwo;
		
		
		
	}
	public double getSideThree(){
		return sideThree;
	
	
}
	
	
	public double getPer() {
		return 1.0*sideOne+1.0*sideTwo+1.0*sideThree;
		
	}
	
	public double getArea() {
		return 1.0*sideThree*height/2;
	}
	

	
	
	

}
