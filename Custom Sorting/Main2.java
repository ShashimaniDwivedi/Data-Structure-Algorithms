
import java.util.*;

class Student {

    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class Main2 {
    public static void main(String[] args) {

        // Max Heap based on marks
        PriorityQueue<Student> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.marks, a.marks));

        pq.add(new Student(80, "Amit"));
        pq.add(new Student(60, "Rahul"));
        pq.add(new Student(90, "Neha"));

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + " " + s.marks);
        }
    }
}
