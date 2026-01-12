package day08_advanced_oop;

class Calculator {

	public int add(int x, int y) {
		return x + y;
	}

	public double add(double x, double y) {
		return x + y;
	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public String add(String x, String y) {
		return x + y;
	}
}

public class PolymorphismOverloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(10.5, 5.5));
		System.out.println(calc.add(10, 5));
		System.out.println(calc.add(10, 5, 5));
		System.out.println(calc.add("Gaurav ", "Shinde"));
	}
}
