class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int x = 20;

    @Override
    void show() {
        System.out.println("Child");
    }

    void display() {
        System.out.println("Display");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Parent p = new Child();

        System.out.println(p.x);// 10
        p.show();// child

        Child c = (Child) p;

        System.out.println(c.x);// 20
        c.show();// child
        c.display();// Display
    }
}