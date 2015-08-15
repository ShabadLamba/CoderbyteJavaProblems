import java.util.Scanner;

public class TImeConvert {

	public static void main(String[] args) {
		// Converts the given input to hours : minutes format
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		Integer num = new Integer(in.nextLine());
			
		Integer time1 = new Integer(num/60);
		Integer time2 = new Integer(num%60);
	    String time = time1 + ":" + time2;
	    
	    System.out.println(time);
	    in.close();

	}

}
