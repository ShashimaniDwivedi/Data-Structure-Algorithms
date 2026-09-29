class Parent {
    Parent() {
        System.out.println("Parent Class Constructor");
    }
}

class Child extends Parent {
    // if we dont define any constructor
    // then java automatically add a default construcotr behind the scene
    // like child(){
    // super()
    // }
    public void show() {
        System.out.println("Child class");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
