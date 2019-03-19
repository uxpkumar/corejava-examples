
public class FinalTest {

	final int x = 10;
	final double PI = 3.14;
	
	public static void main(String[] args) {
		FinalTest myObj = new FinalTest();
		//myObj.x = 40; //values cannot be changed
		//myObj.PI = 25; // values cannot be changed
		
		System.out.println(myObj.x);
	}
}
