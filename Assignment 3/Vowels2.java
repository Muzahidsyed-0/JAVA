package assign;

public class Vowels2 {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		
		String result ="";
		
		for(int i = 0; i < str1.length( );i++) {
			char ch=str1.charAt(i);
			
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && 
				ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' ) {
				
				    result +=ch;
			}
			
		}
            
		 System.out.println(result);
		
	}

}
