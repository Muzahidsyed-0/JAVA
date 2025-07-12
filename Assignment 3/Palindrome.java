package assign;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "A man a plan a canal panama";
		
		str = str.replaceAll(" ", "").toLowerCase();
		
		String reversed = "";
		
		for(int i = str.length() -1 ; i >= 0; i--) {
			
			reversed +=str.charAt(i);
		}
		 
		boolean isPalindrome = str.equals(reversed);
		
		System.out.println(isPalindrome);

	}

}
