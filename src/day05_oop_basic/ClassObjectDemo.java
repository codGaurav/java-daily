package day05_oop_basic;

class Car {
	String model;
	int modelYear;

	void display() {
		System.out.println(model + " " + modelYear);
	}

}

public class ClassObjectDemo {
	public static void main(String[] args) {
	Car car = new Car();
	car.model ="Volvo";
	car.modelYear = 2000;
	
	car.display();
	}
}
