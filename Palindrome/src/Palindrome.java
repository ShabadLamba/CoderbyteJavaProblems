import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// determines is the string is Palindrome or not
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = new String(in.nextLine());
		int flag =0;
		str = str.replaceAll("\\s+","");
		for(int i=0;i<(str.length())/2-1;i++){
			if(str.charAt(i) != str.charAt(str.length()-i-1)){
				flag =1;
			}
		}
		if(flag == 1)
			System.out.println("Not palindrome");
		else
			System.out.println("Palindrome");
		
		in.close();
		

	}

}
