import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*


	Topic 1: ArrayLists Data structure
	
				Why we chose Array- list 
				-  Is a Dynamic data structure. 
				- This refers to an organization or collection of data in memory that has the flexibility to grow or shrink in size,
				- we knew we only had to handle one dimension and we did not know the length of the Data 
				- Array-lists are able to read the data and add it in one step
				
				Arrays 
				- Arrays in some cases are better as in optimizing storage
				Since the add from ArrayList is O(n) and the add to the Array is O(1).
				However because ArrayList uses an Array it is faster to search O(1) in it than normal lists O(n).
				
				-Arrays are also preferred in some cases Array can contain both primitive data types as well as objects of a class
				 depending on the definition of the array. However, ArrayList only supports object(reference), not the primitive data types.
				
				Refer To Code line 110 - 160 (Old)
				
				- LOOP FOR COUNTER
				- THEN LOOP TO ADD
				
				REFER TO NEW CODE 170  NEW
				- DONT NEED A COUNTER JUST ADDX
				
				
			
			
			
	

		























*/

public class ReadingFile {

	public static void main(String[] args) {

		/*
		 * double[] a = readToArray("randomDataExtract1.txt"); for (int i = 0; i <
		 * a.length; i = i + 1) { System.out.println(a[i]); }
		 * 
		 * 
		 * double sum = findSum(a); System.out.println("Sum is "+sum);
		 * 
		 */

		ArrayList<Double> l = readToList("randomDataExtract1.txt");
		System.out.println(l);

		System.out.println(findAS(l));

	}

	public static double findSum(ArrayList<Double> l) {

		double sum = 0;

		for (int i = 0; i < l.size(); i = i + 1) {
			sum = sum + l.get(i);
		}

		return sum;
	}

	public static double findSum(double[] a) {

		double sum = 0;

		for (int i = 0; i < a.length; i = i + 1) {
			sum = sum + a[i];
		}
		return sum;
	}

	/**
	 *
	 * @param str
	 * @return
	 */
	public static double[] readToArray(String str) {

		try {

//A file is COLLECTION.
// Do we know the size of a collection before reading through it?
// We want to copy this into an array.  Do we need to know the size of an array before using it?

//Step 1: Create a File object that uses the passing string as the file name
			File file = new File(str);
//Step 2: Create a scanner object that uses the file object
			Scanner s = new Scanner(file);
//Step 3: Create a counter and set it to zero
			int counter = 0;
//Step 4: Use a while has next loop to count each line
			while (s.hasNext()) {
				s.nextDouble();
				counter = counter + 1;
			}
//Step 5: Outside the loop create your array and set the size to counter
			double[] arr = new double[counter];
//Step 6: Create a new scanner object using file
			Scanner ss = new Scanner(file);
//Step 7: Use a while has next loop but this time read each line into the array
			int i = 0;
//FYI - You could equally use a for loop here because you know it runs for (int i = 0; i < counter; i = i + 1)
			while (ss.hasNext()) {
				arr[i] = ss.nextDouble();
				i = i + 1;
			}
//Step 8: Return array

			return arr;

		} catch (Exception e) {
			System.out.println("File not found");
		}

		System.out.println("Leafs Are Awful");

//Why does this need to be here?
//If the file name is bad the program jumps to catch and then won't return anything.  This returns
//null if the file name is bad
		return null;

	}

//Problem: With read to Array we had to loop through the file twice.  Once to find the number of numbers and
//a second time to read it.  This is really inefficient.
//Question:  Arrays are static data structures meaning you have to know the size in advance and fix that size
// What other group of data structure might be useful here?
//Answer: ArrayLists are dynamic data structures meaning I don't need to know the size in advance.  Read the file
// and add the elements

	public static ArrayList<Double> readToList(String str) {

		try {

			File file = new File(str);

			Scanner s = new Scanner(file);

			ArrayList<Double> list = new ArrayList<Double>(); // Why double is Upper-case because it doesn't support
																// primitive types only object types

			while (s.hasNext()) {
				list.add(s.nextDouble()); // NEW CODE WITH ONE LOOP
			}
			return list;

		} catch (Exception e) {
			System.out.println("file not found");
		}

		return null;
	}

	public static String findAS(ArrayList<Double> l) {
		double sum = 0;

		for (int i = 0; i < l.size(); i = i + 1) {
			sum = sum + l.get(i);
		}
		double average = sum / l.size();

		return ("This is the average " + average + " ------" + " This is the sum " + sum);
	}

}
