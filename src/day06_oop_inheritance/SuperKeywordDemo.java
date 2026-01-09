package day06_oop_inheritance;

class Person {

    Person() {
        System.out.println("Person constructor called");
    }
}

class Employee extends Person {

    Employee() {
        super();  // parent constructor call
        System.out.println("Employee constructor called");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {

        Employee emp = new Employee();
    }
}
