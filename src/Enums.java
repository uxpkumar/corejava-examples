//Enum outside class
enum Level {
	LOW,
	MEDIUM,
	HIGH
}

//Enum inside class
public class Enums {
	
	enum CarBrands {
		BMW,
		BENZ,
		TATA,
		JEEP
	}

	public static void main(String[] args) {
		
		Level myvar = Level.MEDIUM;
		System.out.println(myvar);
		
		CarBrands topBrand = CarBrands.BENZ;
		System.out.println("Top car brand is :"+ topBrand);
	}
}
