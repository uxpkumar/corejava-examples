import java.util.HashMap;


public class Hasmap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("India", "Delhi");
		capitalCities.put("Germany", "Berlin");
		//capitalCities.remove("England");
		//capitalCities.clear();
	
		System.out.println("Capital Cities :" + capitalCities);
		System.out.println("Size of HashMap :" + capitalCities.size());
		
		//System.out.println("Capital of India :" + capitalCities.get("India"));
		
		for(String i:capitalCities.values()){
			System.out.println(i);
		}
		
		for(String i:capitalCities.keySet()){
			System.out.println("keys :"+ i + " ;Values :"+ capitalCities.get(i));
		}
		
		
	}

}
