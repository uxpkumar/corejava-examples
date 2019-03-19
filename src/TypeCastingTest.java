
public class TypeCastingTest {
	
	public static void main(String[] args) {
		
		int i = 100;
		
		System.out.println(i);
		
		long l = i;
		
		System.out.println(l);
		
		float f = l;
		
		System.out.println(f);
		
		//Bigger type to smaller type
		//Explicit type casting
		int x = (int)f;
		System.out.println(x);
		
		char ch = 'c';
		int num = 89;
		
		ch = (char)num;
		System.out.println(ch);
		
		
		double myD = 222.1233d;
		
		int myNum = (int)myD;
		
		System.out.println(myNum);
		
		float myF = 12.12f;
		double myDoub = 1111.232333;
		long myL = 11232L;
		System.out.println(myL);
		
		
		byte b = 50;
				
		b = 50*2;
		System.out.println(b);
		
	}

}
