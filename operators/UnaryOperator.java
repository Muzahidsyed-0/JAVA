package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = -x;
		boolean a = true;
		System.out.println("Unary plus:"+ x);
		System.out.println("Unary Minus:"+ y);
		System.out.println("pre increment:" + (++x));
		System.out.println("pre decrement:" + (--x));
		System.out.println("post increment:" + (x++));
		System.out.println("post decrement:" + (x--));
		System.out.println(!(a));
		
           
	}

}
