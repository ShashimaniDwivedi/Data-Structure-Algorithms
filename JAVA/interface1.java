interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        // we want a show
        // System.out.println("C");
        A.super.show();
    }
}

public class interface1 {
    public static void main(String[] args) {
        C c = new C();
        c.show();

    }

}
