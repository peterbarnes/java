import java.util.Scanner;

public class Counter {
	
	public static void main(String [] args){
		
		// Declare variables
		String msg;
		Scanner sc = new Scanner(System.in);
		int numVowels = 0;
		int numConst = 0;
		int other = 0;
		
		// Put user input into msg variable
		
		msg = sc.nextLine();
		
		for(int i = 0; i < msg.length(); i++) {
			
			char c = msg.charAt(i);
			
			if(c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
				
				numVowels++;
				
			} else {
				
				numConst++;
				
			} 
			
		}
		
		System.out.println("This message contains " + numVowels + " vowels and " + numConst + " consanants.");
		
	}

}
