package assignment;

public class NumberOfOccurances {

	public static void main(String[] args) {
		 
		int [] arr= { 1,2,3,1,2,3,3,4,5,6};
		
		int[] visited=new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(visited[i]==1) {
				
				continue;
				
			}
			
			int count=1;
			
			for(int j = i+1 ; j < arr.length ; j++) {
				
				if(arr[i]==arr[j]) {
					
					count++;
					
					visited[j]=1;
					
				}
			}
			
			System.out.println(arr[i] + " =" + count);
			
		}
		
	}

}
