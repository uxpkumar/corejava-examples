class Person {
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
}


public class EncaptulationTest {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Peter");
		System.out.println(p.getName());
	}
	
}
