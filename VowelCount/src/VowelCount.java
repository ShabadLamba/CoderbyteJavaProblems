import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// Counts the number of vowels in the string
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = new String(in.nextLine());
		
		str = str.toLowerCase();
	    char[] ch = str.toCharArray();
	    int countOfVowel = 0;
	    for(char c: ch){
	      if (c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i'){
	        countOfVowel += 1;
	      }
	    }
	    System.out.println(countOfVowel);
	    in.close();

	}

}
