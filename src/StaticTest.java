public class StaticTest {
	
	static void myStaticMethod(){
		System.out.println("Static method can be called without creating object");
	}
	
	public void nonStaticMethod(){
		System.out.println("Non static method needs object to be called");
	}
	
	public static void main(String[] args) {
		myStaticMethod();
		
		StaticTest st = new StaticTest();
		st.nonStaticMethod();
	}

}
