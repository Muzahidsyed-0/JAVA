package variables;

public class Variables {
	
	static int num1 = 45 ; //Static Variable
	
	int num2 = 50 ; //Instance Variable
	
     public static void main (String[] args) {
    	 
    	 Variables b = new Variables();
    	 
    	 int num3 = 20 ; // Local Variable
    	 
    	 System.out.println( "static Variable :" + num1 );
    	 
    	 System.out.println("Instance Variable :" + b.num2 );
    	 
    	 System.out.println( "Local Variable :" + num3 );
    	 
     }
     
}


