class Vehicle {
	public String brand = "Ford";
	public void honk() {
		System.out.println("tuut, tuut!");
	}
}

class Car extends Vehicle {
	public String modalName = "EcoSport";
}


public class InheritanceTest {
	public static void main(String[] args) {
		Car ford = new Car();
		System.out.println(ford.brand);
		System.out.println(ford.modalName);
		ford.honk();
	}
}
