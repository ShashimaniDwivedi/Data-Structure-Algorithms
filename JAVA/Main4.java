class A {

    A() {
        // automatic super
        System.out.println("A");
    }
}

class B extends A {

    B() {
        // automatic super
        System.out.println("B");
    }
}

class C extends B {

    C() {
        // automatic super
        System.out.println("C");
    }
}

public class Main4 {
    public static void main(String[] args) {
        B c = new C();

    }
}