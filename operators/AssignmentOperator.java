package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("value:"+ x);
		
		 x += 5;
		 System.out.println("Add and Assign:"+ x);
		 
		 x -= 5;
		 System.out.println("Subtract and Assign:"+ x);
		 
		 x *= 2;
		 System.out.println("Multiply and assign:"+ x);
		 
         x /= 2;
         System.out.println("Divide and Assign:"+ x);
         
         x %= 2;
         System.out.println("ModulousDivision and Assign:"+x);
	}

}
