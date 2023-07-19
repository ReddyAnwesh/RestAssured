
public class TestingDemo {
	
	static int num =200;
	
	String color_Of_TheObject = "Yellow";
	//$ and _
	
	double MATHS_PI = 3.14;
	
	
	
	 
	
	
	

	public static void main(String[] args) {
		TestingDemo td = new TestingDemo();
		
		meth3();
		
		td.method2(3, 4);
		td.method2(5, 6);
		td.method2(7, 9);
	

		}
	public static void method1() {
		TestingDemo td = new TestingDemo();
		System.out.println(td.num);
		
		
	}
	public void method2(int a, int b) {
		
		int k = a+b;
		
		System.out.println(k);
		
	}
	
	public static void meth3() {
		int a = 3;
		int b = 4;
		
		int k = a+b;
		
		System.out.println(k);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
