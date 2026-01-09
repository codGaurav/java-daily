package day06_oop_inheritance;

class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();   // inherited method
        dog.bark();  // child class method
    }
}
