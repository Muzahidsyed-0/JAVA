package operators;

public class BitWiseOperator {

	public static void main(String[] args) {
		int a=5;
		
		int b=3;
		
		System.out.println("BitWise AND:"+(a&b));
		
		System.out.println(" OR:"+(a|b));
		
		System.out.println("XoR:"+ (a^b));
		
		System.out.println("Not:"+(~a));
		
		System.out.println("Left SHIFT:"+ (a<<1));
		
		System.out.println("Right Shift:"+ (a>>1));

	}

}
