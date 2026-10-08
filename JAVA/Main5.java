class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 18);
        System.out.println("Default constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}