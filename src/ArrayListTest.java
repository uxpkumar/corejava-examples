
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListTest {
	
	public static void main( String[] args){
		System.out.println("Main Ran");
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("VOLVO");
		cars.add("Maruthi");
		
		System.out.println("cars 1 :"+ cars.get(0));
		cars.set(2, "BENZ");
		System.out.println("cars :"+ cars);
		System.out.println("Array List Size"+ cars.size());
		//cars.clear();
		//System.out.println("Array List Size"+ cars.size());
		
		for(int i=0; i<cars.size(); i++){
			System.out.println("Car Names : "+ cars.get(i));
		}
		
		Collections.sort(cars);
		
		for(String i: cars){
			System.out.println("car names sorted order : "+ i);
		}
		
		//Using Iterator in collection framework
		ListIterator iterator = cars.listIterator();
		
		while(iterator.hasNext()){
			System.out.println("from iterator : " +iterator.next());
		}
		
		//Using iterator to get backword data
			
		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
		}
	}

}
