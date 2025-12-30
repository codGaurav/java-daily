package day02_methods_strings;

public class ScopeDemo {

	int x = 100;
	void testMethod() {
		int x = 500;
		System.out.println("--method--"+x);
	}
			//instance variable or field
	
	public static void main(String[] args) {
		ScopeDemo sd = new ScopeDemo();
		sd.testMethod();
		System.out.println("instance variable: "+sd.x);
	}
}
