package day05_oop_basic;

class ThisKeywordDemo {

    // instance variable
    int id;

    // constructor with parameter (shadowing)
    ThisKeywordDemo(int id) {
        this.id = id;   // this.variable = local variable
    }

    // display method
    void display() {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {

        ThisKeywordDemo obj = new ThisKeywordDemo(101);
        obj.display();
    }
}

