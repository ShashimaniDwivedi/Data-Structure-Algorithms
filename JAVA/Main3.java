class Parent {
    Parent(int x) {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        // we need to explicitely call
        super(10);
        System.out.println("Child Class Constructor");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Child c = new Child();
    }

}
