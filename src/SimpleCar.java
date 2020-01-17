

public class SimpleCar {

	private String colour;
	private String make;
	private String model;
	private boolean isCarStarted = false;
	
	
	
	
	
	public String toString() {
		
		
		
		String result = make;
		result = result + model;
		result = result + colour;
		
		return result;
	}

	public void startCar() {
		System.out.println("Starting your car!");
		isCarStarted = true;
	}

	

	public SimpleCar() {
		colour = "Green";
		make = "Mazda";
		model = "Miata"; 
	}

	public SimpleCar(String inputcolour, String inputMake, String inputModel) {
		colour = inputcolour; 
		make = inputMake; 
		model = inputModel; 
	}	
	
	
	
// creating the car field
	public void printInfo() { 
		System.out.println("====================================="); 
		System.out.println("Make: " + make); 
		System.out.println("Model: " + model); 
		System.out.println("colour: " + colour);
		System.out.println("====================================="); 
	}


}