
public class BooleanTest {
	
	
    Boolean flag = true;
	
    static int x = 10;
    static int y = 20;
    
	public static void main(String[] args) {
		
		BooleanTest bt = new BooleanTest();
		if(bt.flag == true){
			System.out.println(bt.flag);
		}
		
		Boolean ready = x < y;
		System.out.println(ready);
	}
	

}
