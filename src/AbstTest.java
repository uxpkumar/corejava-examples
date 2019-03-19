 abstract class Person1 {
	
	public String name = "John";
	public int age = 27;
	
	public abstract void study();

}

class Student extends Person1 {
	
	public int graduatedYear = 2018;
	public void study() {
		System.out.println("Studying all day long");
	}
}

class AbstTest {
	public static void main(String[] args) {
		
		Student st = new Student();
		st.study();
		
	}
}


