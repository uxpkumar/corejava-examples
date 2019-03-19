
public class exceptTest {
	
	public void checkAge(int age){
		
		if(age < 18) {
			throw new ArithmeticException("Access Denied : - You must be atleast 18 years old");
		}
		else {
			System.out.println("Permission Granted");
		}
	}

	public static void main(String[] args) {
		try {
			
			int[] myNumbers = {1, 2, 2};
			System.out.println(myNumbers[10]);
			System.out.println("Hello");
		}catch(Exception e) {
			System.out.println("An error occurred");
			//e.printStackTrace();
		}finally{
			System.out.println("Try or catch over");
		}
		
		//Custom Exception
		
		exceptTest et = new exceptTest();
		et.checkAge(17);
		System.out.println("Hiiii");
	}
	
}
