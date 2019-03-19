
class Hero {
	static void heroMethod(){
		System.out.println("I am a hero method");
	}
}

public class MethodsTest {
	
	static void myMethod(){
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		myMethod();
		Hero.heroMethod();
		System.out.println();
	}
}
