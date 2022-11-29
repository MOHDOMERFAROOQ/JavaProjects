
 class AnimalSound {
	
	
	public void animalSound() {	
		System.out.println("The animal makes a sound");
		}
	}

	class Cat extends AnimalSound
	{
		public void animalSound() 
		{
			System.out.println("cat sound : meow ");
		}
		public  static void main(String[] agrs) 
		{
			AnimalSound myAnimalSound = new AnimalSound();
			AnimalSound myCat =  new Cat();
			AnimalSound myDog =  new Dog();
			
			myAnimalSound.animalSound();
			myCat.animalSound();
			myDog.animalSound();
			
	}
	class Dog extends AnimalSound
	{
		public void animalSound() 
		{
			System.out.println("Dog sound:bow");
		}
	}
	}
//	class name
//	{
//	public  static void main(String[] agrs) 
//	{
//		AnimalSound myAnimalSound = new AnimalSound();
//		AnimalSound myCat =  new Cut();
//		AnimalSound myDog =  new Dog();
//		
//		myAnimalSound.animalSound();
//		myCat.animalSound();
//		myDog.animalSound();
//		
//	}
//
//	}




