public class constTest {

	int x;
	
	public constTest(){
		x = 10;
	}
	
	public constTest(int y){
		x = y;
	}
	public static void main(String[] args) {
		
		constTest ct = new constTest();
		System.out.println(ct.x);
		
		constTest cty = new constTest(15);
		System.out.println(cty.x);
	}
}
