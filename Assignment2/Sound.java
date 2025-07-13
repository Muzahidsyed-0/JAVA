package com;


class Animal{
	 void makeSound() {
		 System.out.println("Enter the Animal Name and their sounds");
	 }

}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog-Barks");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat-meow");
	}
}
class Cow extends Animal{
	void makeSound() {
		System.out.println("Cow-moos");
	}
}
public class Sound{
	public static void main(String[] args) {
		Animal [] x=new Animal[3];
		x[0]=new Dog();
		x[1]=new Cat();
		x[2]=new Cow();
		
		for(int i=0;i<3;i++) {
			x[i].makeSound();
		}		
	}	
}
