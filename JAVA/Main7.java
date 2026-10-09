class Parent {

    // 1. Static variable
    static int parentStatic = 10;

    // 2. Static block
    static {
        System.out.println("1. Parent static block");
    }

    // // 3. Instance variable
    // int parentInstance = 20;

    // // 4. Instance block
    // {
    // System.out.println("4. Parent instance block");
    // }

    // // 5. Parent constructor
    Parent() {
        System.out.println("5. Parent constructor");
    }

    // // 6. Instance method - can be overridden
    // void show() {
    // System.out.println("Parent show()");
    // }

    // // 7. Static method
    // static void staticShow() {
    // System.out.println("Parent staticShow()");
    // }

    // // 8. Overloaded methods
    // void display(int x) {
    // System.out.println("Parent display(int)");
    // }

    // void display(double x) {
    // System.out.println("Parent display(double)");
    // }
}

// class Child extends Parent {

// // 9. Static variable
// static int childStatic = 30;

// // 10. Static block
// static {
// System.out.println("2. Child static block");
// }

// // 11. Instance variable
// int childInstance = 40;

// // 12. Instance block
// {
// System.out.println("6. Child instance block");
// }

// // Constructor chaining using this()
// Child() {
// this(100);
// System.out.println("8. Child default constructor");
// }

// Child(int x) {
// // super() is automatically inserted as the first statement
// System.out.println("7. Child parameterized constructor");
// }

// // Method overriding
// @Override
// void show() {
// System.out.println("Child show()");
// }

// // Static method hiding
// static void staticShow() {
// System.out.println("Child staticShow()");
// }
// }

public class Main7 extends Parent {

    public static void main(String[] args) {

        System.out.println("3. Main starts");

        // System.out.println("\n--- Creating Child object ---");

        // Parent p = new Child();

        // System.out.println("\n--- Method overriding ---");

        // p.show();

        // System.out.println("\n--- Static method ---");

        // p.staticShow();

        // System.out.println("\n--- Method overloading ---");

        // p.display(10);
        // p.display(10.5);

        // System.out.println("\n--- Exception handling ---");

        // try {
        // int x = 10 / 0;
        // System.out.println(x);
        // } catch (ArithmeticException e) {
        // System.out.println("ArithmeticException caught");
        // } catch (Exception e) {
        // System.out.println("Exception caught");
        // } finally {
        // System.out.println("Finally block");
        // }

        // System.out.println("\n--- Main ends ---");
    }
}