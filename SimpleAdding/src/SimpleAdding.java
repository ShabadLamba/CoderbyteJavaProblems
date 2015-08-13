import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleAdding {

	public static void main(String[] args) {
		// Adds numbers from 1 to the num
		try{
			int i = Integer.parseInt(getInput("Enter a number: "));
			double sum = 0;
			for(int j = 0 ; j<=i ; j++){
				sum += (double) j;
			}
			System.out.println(sum);
		}catch  (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static String getInput (String prompt) throws IOException {
		
		BufferedReader stdin = new BufferedReader(
		new InputStreamReader(System.in));
				
		System.out.print(prompt);
		System.out.flush();
				
		try {
			return stdin.readLine();
		}catch(Exception e){
			return "Error: " + e.getMessage();
		}
	}

}
