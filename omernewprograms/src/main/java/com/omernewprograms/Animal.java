package com.omernewprograms;

abstract class Animal {

	//Abstract method
	public abstract void animalSound();
	//regular method
	public void sleep() {
		System.out.println("Zzz");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.animalSound();
		myCat.sleep();
}
}
//subclass
class Cat extends Animal{
	public void animalSound() {
		//the body of animalsound is provided here
		System.out.println("meow meow");
	}
}


