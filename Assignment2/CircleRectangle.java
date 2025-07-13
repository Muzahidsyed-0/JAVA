
	import java.util.Scanner;

	// Abstract class
	abstract class Shape {
	    abstract void area(); // Abstract method
	}

	// Circle subclass
	class Circle extends Shape {
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    void area() {
	        double result = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + result);
	    }
	}

	// Rectangle subclass
	class Rectangle extends Shape {
	    double length, width;

	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    void area() {
	        double result = length * width;
	        System.out.println("Area of Rectangle: " + result);
	    }
	}

	// Main class
	public class ShapeAreaCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose shape (1 for Circle, 2 for Rectangle): ");
	        int choice = scanner.nextInt();

	        Shape shape;

	        if (choice == 1) {
	            System.out.print("Enter radius of the circle: ");
	            double radius = scanner.nextDouble();
	            shape = new Circle(radius);
	        } else if (choice == 2) {
	            System.out.print("Enter length of the rectangle: ");
	            double length = scanner.nextDouble();
	            System.out.print("Enter width of the rectangle: ");
	            double width = scanner.nextDouble();
	            shape = new Rectangle(length, width);
	        } else {
	            System.out.println("Invalid choice.");
	            scanner.close();
	            return;
	        }

	        shape.area(); // Call area method
	        scanner.close();
	    }
	}
}
