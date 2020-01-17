

import java.util.Scanner;
// This is method used to call the Scanner !!!!
public class SimpleCarRunner {
	

	public static String askQuestions() {

		System.out.println("What wanna do with your car?");
		System.out.println("3. Change Colour"); 
		System.out.println("5. Print info"); 
		System.out.println("6. Exit");
		System.out.println("Please select a number"); 
		Scanner lineScanner = new Scanner(System.in); 
		String userResponse = lineScanner.nextLine(); 

	return userResponse; 
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println();
		

		System.out.println("Ola Bruh, Welcome to Ayden's Shop");
		System.out.println("What's your name?");

		Scanner lineScanner = new Scanner(System.in);
		
		// user input now equals the answer
		String userInput = lineScanner.nextLine();

		System.out.println("Wagwan " + userInput +  "!!");
		
		System.out.println("here is your car!!");
		
	//	System.out.println("Press Enter 4 Car");

		
		

		SimpleCar myCar = new SimpleCar();
		myCar.printInfo(); 


		
		System.out.println("Please type beloew to change colour and model");

		
		//scans the next line 
		String make = lineScanner.nextLine();
	

		String model = lineScanner.nextLine();



		String colour = lineScanner.nextLine();
		

		SimpleCar theUsersCar = new SimpleCar(colour, make, model); 
		theUsersCar.printInfo(); 
		
		String whatTheUserWants = askQuestions(); 



	//TheUsersCar.start();
		System.out.println("Number Selected: " + whatTheUserWants);

		String userActionChoice = lineScanner.nextLine();
		boolean userChoseOptionThree = userActionChoice.equals("3");
		boolean userChoseOptionFive = userActionChoice.equals("5");
		boolean userChoseOptionSix = userActionChoice.equals("6");


		
		if (userChoseOptionThree) {
			 	System.out.println("Input New Colour Below");
			 	//String colour = lineScanner.nextLine();
			 }
			 else if (userChoseOptionFive) {
			 	System.out.println("We're going to print info for your car!");
			 }
			 else if (userChoseOptionSix) {
			 	System.out.println("We're going to make you exit your car!");



			 }


	 }
	}


 