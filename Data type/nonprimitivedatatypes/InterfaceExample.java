package nonprimitivedatatypes;
 
interface Animal{
	void sound();
}
class Dog implements Animal{
	public void sound() {
		System.out.println("Dog Barks");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Dog x = new Dog();
          x.sound();
	}

}
