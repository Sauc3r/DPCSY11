import java.util.ArrayList;

public class ListDemo {

	public static boolean isVowel(char c) {
		
	
		if(c == 'a' || c == 'e' || c ==  'i' || c ==  'o' || c == 'u' ) {
			
			return true;
			
		}
		
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		

		//Reference Type = Object Type (constructing the array list)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		//list.remove(1); // removes index 1
		//list.set(2, 4); // sets index 2 to integer 4
		//list.remove(new Integer(3)); // removes integer 3 in array list
		//list.add(list.indexOf(4)); //gets the index of integer 4 in the array list
		int sum = 0;
		
		for(int i = list.size() - 1; i >= 0; i-- ) {
			if(list.get(i) == 2) {
				sum = sum + list.remove(i);
				//list.remove(i);
				
			}
		}
		
	
		
		
		
		ArrayList<Character> vow = new ArrayList<Character>();
		vow.add('e');
		vow.add('w');
		vow.add('i');
		vow.add('k');
		vow.add('o');
		vow.add('u');
		
		
		String vowels = "";
				//Array list is populated with random characters
				
		for (int i = vow.size() - 1; i >= 0; i--) {
			if(isVowel(vow.get(i))) {
				
				vowels = vowels + vow.remove(i);
				
			}
		}
		
		System.out.println(list);
		System.out.println(sum);
		System.out.println(vow);
		System.out.println(isVowel('c'));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
