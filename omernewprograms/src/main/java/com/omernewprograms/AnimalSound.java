package com.omernewprograms;

class AnimalSound {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Cut extends AnimalSound {
	public void animalSound() {
		System.out.println("cat sound : meow ");
	}

	public static void main(String[] agrs) {
		AnimalSound myAnimalSound = new AnimalSound();
		AnimalSound myCut = new Cut();
		AnimalSound myDog = new Dog();

		myAnimalSound.animalSound();
		myCut.animalSound();
		myDog.animalSound();
	}
}

class Dog extends AnimalSound {
	public void animalSound() {
		System.out.println("Dog sound:bow");
	}
//}
//class test
//{
//public static void main(String[] agrs) 
//{
//	AnimalSound myAnimalSound = new AnimalSound();
//	AnimalSound myCat =  new Cut();
//	AnimalSound myDog =  new Dog();
//	
//	myAnimalSound.animalSound();
//	myCat.animalSound();
//	myDog.animalSound();
//	
}
