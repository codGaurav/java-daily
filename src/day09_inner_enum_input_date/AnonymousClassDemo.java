package day09_inner_enum_input_date;

interface Animal{
	void animalSound();
	
}
public class AnonymousClassDemo {
	public static void main(String[] args) {
		Animal animal = new Animal() {
			@Override
			public void animalSound() {
				// TODO Auto-generated method stub
				System.out.println("Bhow Bhow!");
			}
		};
		
		animal.animalSound();
	}
}
