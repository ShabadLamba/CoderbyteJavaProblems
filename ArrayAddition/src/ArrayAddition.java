import java.util.*;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21,20,21,42,-14};
		String b = Addition(arr);
		System.out.println(b);
		
		
		
	}
	
	public static String Addition(int[] nums){
		Arrays.sort(nums);

        int max = nums[nums.length - 1];
        int sum;

        for( int i = 0; i < nums.length - 1; i++ ){
            sum = nums[i];
            System.out.println(" "+sum);
            for( int j = 0; j < nums.length - 1; j++ ){
                if( i != j ){
                    sum += nums[j];
                    if( sum == max ){
                        return "true";
                    }
                }
                System.out.println("j : "+sum);
            }
            for( int k = 0; k < nums.length - 1; k++ ){
                if( i != k ){
                    sum -= nums[k];
                    System.out.println("k : "+sum);
                    if( sum == max ){
                        return "true";
                    }
                }
            }
        }

        return "false";
  }
}
