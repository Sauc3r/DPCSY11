import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



	public class $AO {
	
	
	
	public static String setXxx(String s) {	
		
		if (s.length() < 3) {
			
			
			return s;
			
			
		}else {
			
			String r1  = s.charAt(0) + "xxx" + s.charAt(s.length()-1);
		}
		return r;
	
	
	
	}
	




	


	// ********************** Oct 10th, 2019 *************************
	/**
	 * This function takes an array of integers and returns the sum of digits 
	 * 
	 * 
	 * @param a
	 * @return
	 * 
	 * 
	 * pre-conditions: all elements are 2 digits in length
	 * post-condition; a is not changed when the function is done.
	 * 
	 * 
	 */
	


	
	//START CLASS Sept 30, 2019
	
	public static int base10toBase2(int n) {
		
		String r = "";
		
		while(n > 0)	{
			int x = n % 2;
			n = n / 2;
			r = x + r;
			
			
			
			
		}
		//Changing Type
		//Changing Type is called "casting"
		//In java there are "shortcuts"
		
		try {
		return Integer.parseInt(r);
		
		}
				catch(Exception e) {
					return -1;
					
				}
		
		
	
	
	
	
	}
	
	
	public static int base10toBaseN(int n, int base) {
		

		String r = "";
		
		while(n > 0)	{
			int x = n % 2;
			n = n / 2;
			r = x + r;
			
			
			
		}
		
		
		return Integer.parseInt(r);
		
		
	}
	


	/**
	 * 
	 * This takes two strings a and b and returns combined
	 * @param a
	 * @param b
	 * @return
	 * 
	 * preconditions - a and b are valid strings
	 * postconditions - no post conditions
	 * 
	 */
	
	String addStrings(String a, String b) {
		
		return a + b;
		
	}
	
	public static boolean isEvenString(String a) {
		
		if (a.length() % 2 == 1) {
			return false;
		}else {
			return true;
			
			
		}
	}
		
		/**
		 * This method takes a base 2 value and returns the base 10 value
		 * @param n
		 * @return
		 * 
		 * precondition:n can only contain 1 and 0 values.	 
		 * 
		 * */
		public static int base2to10A(int n) {
			int pwr = 0;
			int r = 0;
			
			while (n > 0) {
				int x = n % 10;
				n = n / 10; //integer division
				
				
				
				r = r + x * (int)Math.pow(2, pwr);
				
				pwr = pwr + 1;
				
				
			}
			
			return r;
		}

		
		
		public static int base2to10B(int n) {
			
		String value = "" + n;
		
		int pwr = 0;
		int r = 0;
		
		
		for (int i = value.length() - 1; i >= 0; i = i - 1) {
			
			int x = Integer.parseInt(value.substring(i,i + 1));
			
			r = r + x * (int)Math.pow(2, pwr);
			pwr = pwr + 1;
			
			
		}
		return r;
		
			
			
			
		}
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		
	
	
public static String StringPullN(String a, int n) {

	if (a.length() < n) {
		return a;
	}else {
		return a.substring(0,1);
		
		
	}
	
}
	

public static void doThis(int [] n) {
	
	
	n[0] = 99;
	
	
}
	


public static int fingArrayDigitSum(int[] a) {
	
	//
	int sum = 0;
	
	//loop through array
	for (int i = 0; i < a.length; i = i++) {
		
		int temp = a[i]; //assignment statement
		int n1 = temp%10;
		int n2 = temp/10; //java specific INT/INT -- > integer division			\
		sum = sum = n1 + n2;
		
		
		
	}
	
	
	return sum;
}


	public static int findArrayDigitSumSTR(int [] a) {
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			//CASTING - process of changing type
			String temp = "" + a[i];
			String n1 = temp.substring(0,1);
			String n2 = temp.substring(1,2);
			if ( temp.length() > 1) {
				n2 = temp.substring(1,2); // Gets rid of syntax error by changing longer than 3 length strings to only the first 2
			}
			sum = sum + Integer.parseInt(n1) + Integer.parseInt(n2);
			
		}
		
		
		return sum;
		
		
	}
	
	
	
	//public static int[] inputIntArray() {
		
		
		
		
		/*
			"*******************Class  - OCT 3, 2019*******************"
		//step 1: Create Scanner
		Scanner s = new Scanner(System.in);
		System.out.print("how many elements");
		int n = s.nextInt(); // instance method, called with a n instance s
		
		
		int result = new int[n];
		
		for (int = i = 0; i < n; i++) {
			
			System.out.print("input value:");
			result[i] = s.hasNextInt();
			

			
		}
		
		return i;
		//extension Suggestions;
		// Create a method that randomly generates an array of ints
		// Create a version that takes another type
		// create a version where you have an upper and lower parameter that restrict inputs.
	}
	
	*/
	
		
		//********************** Oct 15th, 2019 *************************

		/**
		 * This function takes an array of strings and find the largest value alphabetically
		 * If the array is empty the function returns null
		 * @param s
		 * @return
		 * 
		 * PreConditions - the array can be any length
		 * postcondition - the array is left unchanged
		 */

		
		
		/**
		 * Bubble Sort - 
		 * @param a
		 */
		public static void arraySort(int[] a) {
		  boolean sorted = false;
		    int temp;
		    while(!sorted) {
		        sorted = true;
		        for (int i = 0; i < a.length - 1; i++) {
		            if (a[i] > a[i+1]) {
		                temp = a[i];
		                a[i] = a[i+1];
		                a[i+1] = temp;
		                sorted = false;
		                
		            }
		            
		        }
		        
		    }
		    
		
		}	//end arraySort
		
		
		
		
	public static void reversequeue(Queue<String> q) {
		
		
		Stack<String> s = new Stack<String>();
		
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
	
	}
	
	public static void printMatrix(int r, int c) {

		

		for (int i = 0; i < r; i++) {

			int count = 1;
			
			System.out.println("");

			for (int ayds = 0; ayds < c; ayds++) {
				
				System.out.print(count + " ");

				count++;
				if (ayds ==
						3) {
					System.out.print("3 ");
				}
				
			}

		}

		



		

	}
	
	
	public static void test1_3_6(int n) {
		
		int k = 1;
		
		while (k<= n) {
			
			
			System.out.println(k);
			
			k = k + 1;
		}
	}
		
/**
 * 
 * @param a
 * @param b
 * @param c
 * @return
 */
		
public static int[] createRandomArray(int a, int b, int c) {
		
		
		
		int [] arr = new int [a];
		for(int i = 0; i < arr.length; i++) {
			int x = (int)(Math.random()*(c + 1 - b)+ b );
			
			arr[i] = x;
			
			
		}
		
		return arr;
		
		
		
		
		
		
		
}


public static boolean foundElement(int a [], int b) {
	
	for(int i = 0; i < a.length; i = i +1) {
	if(a[i] ==  b) {
			return true;
					
		}
	

	
	
	}
	return false;

}


/*public static int[][] createRandom2DArray(int rows, int columns){
	

	int[][] arr = new int [rows][columns];
	//code loop
	
	for(int r=0; r<arr.length; r++) {
			arr[r][c] = (int)(Math.random() * 100);			
		}
		
		
	}
	
	
	
	return arr;
}
*/
public static void print2DRowMajor(int[][] arr) {
	
	for ( int c = 0; c< arr[0].length; c++) {
		for (int r  = 0; r < arr.length; r++){
		
		}
	}
}


public int[][] HLPNOV201714(){
	
	int[] values = {7, -3, 9, -1, -6, -5, 1};
	int[] rowc = {1, 1, 3, 3, 4, 7};
	int[] col = {0, 2, 4, 2, 1, 4, 5}; 
	
	//ASK: Write the algorithm hat will take 
	//		these three arrays and created the resulting 2d array.
	//		When you run this it should return the 6 by 6 array given 
	//		in the question
	
	
	return null;
	
}


public static int[][] genSpiralArray(int n){

	

	int z = 1;

	int t = 0;

	int l = 0;

	int r = n-1;

	int b = n-1;

	int[][] a = new int[n][n];

	

	while (z <= n*n) {

		int c1 = l;

		while (c1 <= r) {

			a[t][c1] = z;

			z++;

			c1 = c1 + 1;

		}

		t = t + 1;

		int c2 = t;

		while (c2 <= b) {

			a[c2][r] = z;

			z = z+1;

			c2 = c2 + 1;

		}

		r = r-1;

		int c3 = r;

		while (c3 >= l) {

			a[b][c3] = z;

			z = z+1;

			c3 = c3 - 1;

		}

		b = b-1;

		int c4 = b;

		while (c4 >= t) {

			a[c4][l] = z;

			z = z+1;

			c4 = c4-1;

		}

		l = l+1;

	}

	

	return a;

}



	
	
	
	public static void main(String[] args) {
		
		
		Queue<String> q1 = new LinkedList<>();

		q1.add("one");

		q1.add("two");

		q1.add("three"); 

		System.out.println(q1); 

		reversequeue (q1); 

		System.out.println(q1);
		
		
		
		//********************** October 21st, 2019 *************************
				//Creating a Stack
				// Reference Type = new Object Type
				Stack<String> s1 = new Stack <>();
				// reference type: it tells you what to expect when you follow the reference to the object
				// Object Type: This is what you actually find
				//generally at this stage the object type and reference type match
				//type match. eventually they won't
				Scanner s = new Scanner(System.in);
				Object os = new Scanner(System.in);
				
				s1.push("one");
				s1.push("two");
				s1.push("three");
		
		
		
	
		
	//Creating Arrays
	int a[]=new int[5]; 
	a[0]=1;  
	a[1]=2;  
	a[2]=7;  
	a[3]=4;  
	a[4]=5;  
	
	int [] b = {10,20,30,40,50};
	
	int[] arr = {23,12,89};
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("*******************Class  - SEPT 23, 2019*******************");
	
	System.out.println(b);
	
	for(int i=0;i<a.length;i++)//Bread
		System.out.println(a[i]);
		
	
	//toString is an overloaded method which means there are different versions 
	//Picked based on parameters
	
	System.out.println("*******************Class  - SEPT 30, 2019*******************");
	
	System.out.println(Arrays.toString(a));
	
	System.out.println("*******************Class  - OCT 7, 2019*******************");
	

	
	System.out.println(isEvenString("Hello"));
	
	System.out.println("*******************Class  - OCT 11, 2019*******************");
	
	
	

	
	System.out.println("*******************Class  - OCT 15, 2019*******************");
	
	String[] arr1 = {"cat", "dog", "fish", "dog", "apple"};

	
	
	System.out.println("*******************Class  - OCT 21, 2019*******************");
	
	
	//********************** Oct 21st, 2019 *************************
			//Creating a Stack
			// Reference Type = new Object Type
			Stack<String> 
			s11 = new Stack <>();
			// reference type: it tells you what to expect when you follow the reference to the object
			// Object Type: This is what you actually find
			//generally at this stage the object type and reference type match
			//type match. eventually they won't
			Scanner s10 = new Scanner(System.in);
			Object os10 = new Scanner(System.in);
			
			s11.push("one");
			s11.push("two");
			s11.push("three");
			
			System.out.println(s11);
			
			
			
			System.out.println("*******************Class  - NOV 14, 2019*******************");
			
			printMatrix(4,6);
			
			System.out.println("*******************Class  - NOV 14, 2019 - PART 2 	*******************");
			
			
			
			test1_3_6(8);
			
			
			
			System.out.println("*******************Class  - NOV 18, 2019  	*******************");
			
			int[] result = createRandomArray(4, 1, 9);
			System.out.println(Arrays.toString(result));
			
			
			System.out.println("*******************Class  - NOV 19, 2019  	*******************");	
			
			//int[][] result1 = createRandom2DArray(1, 9);
			//System.out.println(Arrays.toString(result));
			
			
			
			System.out.println("*******************Class  - NOV 20, 2019  	*******************");	
			
			
			// test is a 3d array
		     int[][][] test = {
		              {
		               {1, -2, 3}, 
		               {2, 3, 4}
		              }, 
		              { 
		               {-4, -5, 6, 9}, 
		               {1}, 
		               {2, 3}
		              } 
		     };
		     
		     // for..each loop to iterate through elements of 3d array
		     for (int[][] array2D: test) {
		        for (int[] array1D: array2D) {
		           for(int item: array1D) {
		              System.out.println(item);
		           }
		        }
		     }
		  }
;			
			
	
	
	
}








	
	
	
	


	
	
	


	
	
	
	

	
	
	
	


