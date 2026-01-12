package day08_advanced_oop;

class Animal {
	public void sound() {
		System.out.println("Animal makes sound!");
	}
	
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("Cat meows: meow meow!");
	}
	
}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Dog barks: woof woof!");
	}

}

public class PolymorphismOverriding {
	public static void main(String[] args) {
		
        // Parent reference, child objects - THIS IS POLYMORPHISM!
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		Animal animal3 = new Cow();
		
        System.out.println("=== Polymorphism Demo ===");

        animal1.sound();  // Calls Dog's sound()
        animal2.sound();  // Calls Cat's sound()
        animal3.sound();  // Calls Cow's sound()
        
        System.out.println("\nAll can eat:");
        animal1.eat();    // Inherited method
        animal2.eat();
        animal3.eat();
        
     // Array of animals - polymorphism power!
        System.out.println("\n=== Array of Animals ===");
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        
        for(Animal animal : animals) {
        	animal.sound();
        }
	}
}
