import java.util.Scanner;

public class LetterCapitalize {

	public static void main(String[] args) {
		// Capitalizes the first letter of each word in a string
		
		String answerString = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = in.nextLine();
//			String str =  getInput("Enter a string: ");
		String[] s1 = str.split(" ");
		for(String s2 : s1){
			char c =  Character.toUpperCase(s2.charAt(0));
			answerString += c + s2.substring(1, s2.length()) + " "; 
		}
		System.out.println(answerString);
		in.close();

	}

}
