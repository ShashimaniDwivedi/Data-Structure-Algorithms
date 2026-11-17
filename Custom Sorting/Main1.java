
import java.util.*;

class Student {

    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class Main1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(80, "Amit"));
        list.add(new Student(60, "Rahul"));
        list.add(new Student(90, "Neha"));

        // Comparator: Descending order
        Comparator<Student> comp = (a, b) -> Integer.compare(b.marks, a.marks);
        Comparator<Student> comp1 = (a, b) -> a.name.compareTo(b.name);

        // Collections.sort(list, comp);
        Collections.sort(list, comp1);

        for (Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
