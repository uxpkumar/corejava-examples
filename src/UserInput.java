import java.util.Scanner;


public class UserInput {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String userName = myObj.nextLine();
		System.out.println("User Name is :" + userName);
	}

}
