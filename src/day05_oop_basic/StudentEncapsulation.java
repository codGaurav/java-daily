package day05_oop_basic;

class Test {

    // private variables
    private String name;
    private int age;

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for age
    public int getAge() {
        return age;
    }
}

public class StudentEncapsulation {

    public static void main(String[] args) {

        // object creation
        Test student = new Test();

        // setting values using setters
        student.setName("Rahul");
        student.setAge(20);

        // getting values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
