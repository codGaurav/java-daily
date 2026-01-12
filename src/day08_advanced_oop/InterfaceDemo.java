package day08_advanced_oop;

//Interface - 100% abstract (until Java 8)
interface Drawable {
	// All methods are public abstract by default
	void draw();
}

interface Colorable {
	void setColor(String color);

	String getColor();
}

//Class implementing one interface
class Circle2 implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}
}

//Class implementing multiple interfaces
class Rectangle2 implements Drawable, Colorable {

	private String color;

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}

}

public class InterfaceDemo {
	public static void main(String[] args) {

		Drawable circle = new Circle2();
		circle.draw();

		System.out.println();

		Rectangle2 rectangle2 = new Rectangle2();
		rectangle2.draw();
		rectangle2.setColor("RED");
		System.out.println("Rectangle color: " + rectangle2.getColor());

		// Interface reference
		System.out.println("\n=== Interface Reference ===");
		Drawable drawable = new Rectangle2();
		drawable.draw();

		Colorable colorable = new Rectangle2();
		colorable.setColor("BLUE");
		System.out.println("Color: " + colorable.getColor());
	}
}
