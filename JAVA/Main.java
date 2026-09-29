class Parent {
    Parent() {
        // super() automatic written by java call object class constructor
        System.out.println("Parent constructor");
    }

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        // super() java add by default in all constructor
        System.out.println("child constructor");
    }

    // @Override
    static void show() {
        System.out.println("Child");
    }
}

class Main {
    public static void main(String[] args) {
        // first call parent constructor then child constructor because of hidden
        // super()
        Parent p = new Child();
        p.show();
        // output will be Parent
        // because static method will not take part in method overriding
    }
}