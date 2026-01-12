package day08_advanced_oop;

//Abstract class - cannot create object directly
abstract class Shape {

	protected String color;

	// Abstract method - no body, must be implemented by child
	abstract double calculateArea();

	// Concrete method - has body, inherited as it is
	void displayColor() {
		System.out.println("Color: " + color);
	}

}

class Circle extends Shape {

	double radius;

	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}

class Rectangle extends Shape {

	double length;
	double breadth;

	Rectangle(double length, double breadth, String color) {
		this.length = length;
		this.breadth = breadth;
		this.color = color;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

}

class Triangle extends Shape {

	double base;
	double height;

	Triangle(double base, double height, String color) {
		this.base = base;
		this.height = height;
		this.color = color;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

}

public class AbstractClassDemo {
	public static void main(String[] args) {

		// Cannot create: Shape shape = new Shape(); // ERROR!

		Shape circle = new Circle(5.5, "Red");
		Shape rectangle = new Rectangle(15.5, 10.5, "Blue");
		Shape triangle = new Triangle(5.5, 5.5, "Green");

		System.out.println("----Circle----");
		circle.displayColor();
		System.out.println("Areo of Circle: " + circle.calculateArea() + "\n");

		System.out.println("----Rectangle----");
		rectangle.displayColor();
		System.out.println("Areo of Rectangle: " + rectangle.calculateArea() + "\n");

		System.out.println("----Triangle----");
		triangle.displayColor();
		System.out.println("Areo of Triangle: " + triangle.calculateArea() + "\n");

		// Polymorphism with abstract class
		System.out.println("----Array of Shapes----\n");
		Shape[] shapes = { circle, rectangle, triangle };

		for (Shape shape : shapes) {
			shape.displayColor();
			
			System.out.println("Area: " + shape.calculateArea());
		}
	}
}
