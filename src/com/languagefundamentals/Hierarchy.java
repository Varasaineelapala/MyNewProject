package com.languagefundamentals;

class Animal{
	Animal(){
		this("Serpents");
		System.out.println("Animal's no args constructor called");
	}
	Animal(String name){
		System.out.println("Animal's one args constructor called");
	}
	
}
class Mammal extends Animal{
	Mammal(){
		this("dog");
		System.out.println("Mammal's no arg constructor called");
	}
	Mammal(String name1){
		super();
		System.out.println("Mammal's one arg constructor called");
	}
	Mammal(String name1,String name2){
		this();
		System.out.println("Mammal's two arg constructor called");
	}
	
}
class Dog extends Mammal{
	Dog(){
		this("Huskey");
		System.out.println("Dog's no arg constructor called");
	}
	Dog(String breade){
		super("dog","cat");
		System.out.println("Dog's one args constructor called");
	}
	
}
public class Hierarchy {

	public static void main(String[] args) {
		Dog d1=new Dog();

	}

}
