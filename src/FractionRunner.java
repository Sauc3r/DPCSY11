
public class FractionRunner {
	
	
	
	
	
	
	
	public static void main(String[]args) {
		
		
		System.out.println(Fraction.getfractionCount());
		Fraction f = new Fraction(4,3);
		System.out.println(Fraction.getfractionCount());
		
		
	
		
		
		System.out.println(f);
		
		
		Fraction g  = f;
		
		
		System.out.println(g.getNum()+"/"+ g.getDen());
		System.out.println(Fraction.getfractionCount());
		
		
				
		
		System.out.println("Getting Decimal");
		System.out.println(f.getDecimal());
		
		System.out.println("Dividng");
		System.out.println(f.getNum()+"/"+ f.getDen());
		System.out.println("Multiplying num And den");
		System.out.println(f.changeBase());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
