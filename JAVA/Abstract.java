abstract class Animal {
    Animal() {
        System.out.println("Abstract class Constructor");
    }

    public abstract void sound();

    public abstract void color();

    public void run() {
        System.out.println("Animal is running");
    }
}

// the Imple class has to implement all abstract method unless it is itself
// abstract
// if we abstract then error will be gone but
// still we have to make another class
// which must implement all abstract method
abstract class ImpleAnimal extends Animal {

    @Override
    public void sound() {
        System.out.println("Animal make sound imple");
    }
}

class Impl extends ImpleAnimal {
    @Override
    public void sound() {
        System.out.println("Animal make sound imple 2");
    }

    @Override
    public void color() {
        System.out.println("Animal is of Black colorimple 2");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // we cant create object of abstract class
        // we can create obj of that class which is implementing abstract class
        // Animal a=new Animal();// give error
        // ImpleAnimal ia=new ImpleAnimal();//give error
        Impl i = new Impl();
        i.sound();
        i.color();
    }

}
