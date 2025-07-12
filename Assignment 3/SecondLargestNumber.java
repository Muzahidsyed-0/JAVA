package assign;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = { 10 , 5 , 20 , 8 , 20 };
		
		 Arrays.sort(arr);
		 
		 int largest= arr[arr.length-1];
		 
		 for(int i = arr.length - 2 ; i >= 0 ; i-- ) {
			 
			 if(arr[i] < largest) {
				 System.out.println("Second largest number: " + arr[i]);
				 return;
			 }
		 }
            
		 System.out.println("Not FOUND");
	}

}
