
public class Fraction {
	
	
	 //Attributes/Fields
		// Suggestion - Never use the same variable name that a field s in your class
	 
	
	//make fields private so you can only access them through the class.
    	private int num;
    	private int den; 
    	private static int fractionCount = 0;
	
	
	 //Constructors 
	  //if there is no constructor a default constructor is made
    	// numeric = 0;
    	// boolean == false;
    	//reference types = null
    	
    	
    	
    	//CONSTRUCTORS ARE SPECIAL INSTANCE METHODS
    	// that are only called once 
    	// 	- a constructor does not indicate a return type 
    	// 	- a constructor must be public
    	// 	- a constructor is always named using the class name
	  
	  public Fraction (int n, int d){
		  num = n;
		  if (d!=0) {
			  den = d;
		  }else {
			  den = 1;
		  }
		  fractionCount = fractionCount +1;
		  
	  }
	
	 //Behaviors 
    	
    	//Accessory Methods (get)
    	public int getNum() { return num;}
    	public int getDen() {return den;}
    	
    	//MUTATOR (Set)
    	public void setNum(int n) {
    		num = n;
    	
    	
    	}
    	public void setDen(int d) {
    		if(den != 0) {
    		den = d;
    		}
    	}
    	
    	public static int getfractionCount() {return fractionCount;}
    	
    	
    	
    	public double changeBase() {
    		
    		double whole = num * den;
    		
    		
    		return whole;
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	public double getDecimal() {
    		double value = 1.0*num/den;
    		
    		return value;
    		
    		
    		
    	}
    	
    	public void reduce() {
    		//Step 1: Find greatest common factor (GCF)
    		int gcf = 1;
    		 for ( int i = 2; i < Math.min(this.num, this.den); i++) {
    			 if ( this.num %i == 0 && this.den%i==0) {
    				 gcf = i;
    				 
    				 
    				 
    				 
    				 //Step 2: Divide num and den by GCF
    				 this.num = this.num/gcf;
    				 this.den = this.den/gcf;
    		}
    	}
	}
	 
	
	

}
