package assign;

public class Vowels {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		
		String result = str1.replaceAll("[aeiouAEIOU]","");
		
		System.out.println(result);
		

	}

}
