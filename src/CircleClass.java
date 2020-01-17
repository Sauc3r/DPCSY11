
public class Circle {

	private double rad;
	private int x;
	private int y;
	private final static double PI = Math.PI;
	
	//Constructors
	
	public Circle(int r) { rad = r;}
	
	//Behaviors
	
	public double getRadius() { return rad;}
	
	public int getX() {return x;}
	
	public int getY() {return y;}
	
	public void setRadius(double r) {
		if( r>= 0)
			rad= r;
		
	}
	
	
	public void setX(int x) { this.x = x;}
	
	
	public void shrink(double scale) {
		rad = rad / scale;
		
		
	}
	
	public double getCircumference() {
		return 2 * PI*rad;
		
		
	}
	
	public double getArea() {
		return PI*rad*rad;
		
		
	}
	public double getDiameter(int r) {
		
		
		return PI
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
