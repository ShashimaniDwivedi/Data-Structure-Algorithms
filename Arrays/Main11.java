
import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Staff extends Person {
    String staffId;
    String department;

    Staff(String name, int age, String staffId, String department) {
        super(name, age);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}

class Faculty extends Staff {
    String specialization;
    List<String> coursesTaught;

    Faculty(String name, int age, String staffId,
            String department, String specialization,
            List<String> coursesTaught) {

        super(name, age, staffId, department);
        this.specialization = specialization;
        this.coursesTaught = coursesTaught;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Courses Taught: " + coursesTaught);
    }

    void teachCourse(String courseName) {
        System.out.println(name + " is teaching " + courseName + ".");
    }
}

public class Main11 {
    public static void main(String[] args) {

        Faculty f = new Faculty(
                "Rahul Sharma",
                35,
                "ST101",
                "Computer Science",
                "Artificial Intelligence",
                Arrays.asList("Java", "Python", "Machine Learning"));

        f.displayDetails();
        f.conductMeeting();
        f.teachCourse("Java");
    }
}
