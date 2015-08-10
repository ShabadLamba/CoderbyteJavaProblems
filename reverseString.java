import java.io.*;
import java.util.ArrayList;

public class reverseString {

	public static void main (String[] args){
		String newString = new String();
		String oldString = new String(args[0]);
		System.out.println(oldString);
		char[] arrayofOldString = oldString.toCharArray();
		System.out.println(arrayofOldString[0]);
		for(int i = 0 ; i < oldString.length() ; i++){
			newString += arrayofOldString[oldString.length()-1-i];
		}
		System.out.println(newString);
	}
}