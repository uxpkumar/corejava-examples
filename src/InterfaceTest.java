interface Animal {
	public void animalSound();
	public void run();
}

interface Color {
	public void getColor();
}

class Cat implements Animal, Color{
	public void animalSound(){
		System.out.println("Cat says : meow");
	}
	
	public void run(){
		System.out.println("Cat is running");
	}
	
	public void getColor(){
		System.out.println("Cat color is White and Gray");
	}
}

class InterfaceTest {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.animalSound();
		cat.run();
		cat.getColor();
	}
}