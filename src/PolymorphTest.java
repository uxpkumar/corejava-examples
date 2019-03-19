class AnimalX {
	public void animalSound(){
		System.out.println("This animal makes a sound");
	}
}

class Cat1 extends AnimalX {
	public void animalSound(){
		System.out.println("Cat makes meow-- sound");
	}
}

class Dog extends AnimalX{
	public void animalSound(){
		System.out.println("Dog makes vow vow-- sound");
	}
}

public class PolymorphTest {

	public static void main(String[] args) {
		
		AnimalX animal = new AnimalX();
		animal.animalSound();
		
		Cat1 cat1 = new Cat1();
		cat1.animalSound();
		
		Dog dog1 = new Dog();
		dog1.animalSound();
	}
}
