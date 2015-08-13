import java.io.*

public class LetterChanges{

	public static void main(String[] agrs){
		String s1 = getInput("Enter a string: ");
//		Str.toCharArray;
		System.out.println(s1);
		
		
	}
	public static String getInput (String prompt) throws IOException {
		
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print(promt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		}catch(Exception e){
			return "Error: " + e.getMessage();s
		}
	}

	public String vowelHandler(String Str){
		Str.replace('a','A');
		Str.replace('e','E');
		Str.replace('i','I');
		Str.replace('o','O');
		Str.replace('u','U');
		return Str
	}

}