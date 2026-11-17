
import java.util.*;

class Student implements Comparable<Student> {

    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // Sorting logic inside Student class
    public int compareTo(Student s) {
        // return Integer.compare(s.marks, this.marks);
        return this.name.compareTo(s.name);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(80, "Amit"));
        list.add(new Student(60, "Rahul"));
        list.add(new Student(90, "Neha"));
        // Ab jab hum sorting karenge to jaisa humne define kiya hai waise sorting hogi
        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
