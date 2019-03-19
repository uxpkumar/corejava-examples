
public class ArrayTest {
	
	public static void main(String[] args) {
		
		String cars[] = {"BMW", "TATA", "BENZ"};
		
		cars[1] = "JEEP";
		
		System.out.println(cars.length);
		System.out.println(cars[1]);
		
		//Loop through an array
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		for(String i: cars){
			System.out.println(i);
		}
		
		int[] myarr= new int[2];
		
		myarr[1] = 10;
		System.out.println(myarr[0]);
	}

}
