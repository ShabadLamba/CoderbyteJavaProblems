import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// to check if number is prime or not
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer");
		Integer num = new Integer(in.nextInt());
		System.out.println(isPrime(num));
		in.close();
	}
	public static boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}

}
