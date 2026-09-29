class Animal {
    int x = 10;

    public void sound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    int x = 20;

    public void breed() {
        System.err.println("Husky");
    }

    @Override
    public void sound() {
        System.out.println("Bhau Bhau");
    }
}

class Cat extends Animal {
    int x = 30;

    public void color() {
        System.out.println("Cat is of Black color");
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Animal c = new Cat();
        System.out.println(c.x);
        System.out.println(c instanceof Cat);
        System.out.println(c instanceof Animal);
        System.out.println(c instanceof Dog);
        // Cat c = new Cat();
        // c.color();
        // c.sound();
        // Animal a=c;
        // Animal a = new Animal();
        // // This will not error at compile time
        // // but throw error at run time
        // try {
        // Cat c = (Cat) a;
        // } catch (Exception e) {
        // System.out.println(e);
        // }
    }

}
