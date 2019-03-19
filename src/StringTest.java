
public class StringTest {
	
	static String greetings = "Hi";

	public static void main(String[] args) {
		
		String greetings = "Hello";
		//System.out.println(String.greetings);
		
		int len = greetings.length();
		System.out.println(len);
		System.out.println(greetings.toLowerCase());
		System.out.println(greetings.toUpperCase());
		
		String firstName = "John";
		String lastName  = "Doe";
		
		System.out.println(firstName+" "+lastName);
		System.out.println(firstName.concat(lastName));
	}
}
