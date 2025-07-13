package assign;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
	
		        int[] arr1 = {1, 3, 5};
		        
		        int[] arr2 = {2, 4, 6};

		        int[] merged = new int[arr1.length + arr2.length];
		         
		        for( int i = 0 ; i < arr1.length ; i++ ) {
		        	
		        	merged[i] = arr1[i];
		        }
		        
		        for(int j = 0 ; j < arr2.length ; j++) {
		        	merged[j + arr1.length] = arr2[j];
		        }
		        Arrays.sort(merged);
		        
		       for(int k=0;k<merged.length;k++) {
		    	   
		    	   System.out.print(merged[k] );
		    	   
		    	  
		       }
	}
}
	