package assignment;
public class PrintFirstCharacterNonRepeating{
public static void main(String[] args) {
	
	String x="ABCABCDEF";
	
	 for(int i = 0 ; i < x.length() ; i++) {
		 
		  char y = x.charAt(i);
		  
		  boolean b = true;
		  
		  for(int j = 0 ; j < x.length() ; j++) {
			  
			  if(i!=j  && y== x.charAt(j)) {
				  
				   b= false;
				   
			  }
		  }
		  
		  if(b) {
			  System.out.println("not repeated character:" + y);
			  
			  return;
		  }
		  
	 }
	 
	 System.out.println(" repeating characters");    
	 
}

}
