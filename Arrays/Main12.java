
import java.io.*;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int total;
    double percentage;
    char grade;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculateResult();
    }

    void calculateResult() {
        total = 0;

        for (int mark : marks) {
            total += mark;
        }

        percentage = total / 5.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 50)
            grade = 'C';
        else if (percentage >= 35)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println(
                rollNo + " " + name + " " +
                        Arrays.toString(marks) + " " +
                        total + " " + percentage + "% " + grade);
    }

    String getResult() {
        return rollNo + " " + name + " " +
                Arrays.toString(marks) + " " +
                total + " " + percentage + "% " + grade;
    }
}

public class Main12 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Read student data from file
        try (Scanner sc = new Scanner(new File("students.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] data = line.split("\\s+");

                int rollNo = Integer.parseInt(data[0]);
                String name = data[1];

                int[] marks = new int[5];

                for (int i = 0; i < 5; i++) {
                    marks[i] = Integer.parseInt(data[i + 2]);
                }

                students.add(new Student(rollNo, name, marks));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Sort by total marks, highest first
        students.sort((s1, s2) -> Integer.compare(s2.total, s1.total));

        // Display all student details
        System.out.println("Roll Name Marks Total Percentage Grade");

        for (Student s : students) {
            s.display();
        }

        // Write results to output file
        try (PrintWriter pw = new PrintWriter("results.txt")) {
            pw.println("Roll Name Marks Total Percentage Grade");

            for (Student s : students) {
                pw.println(s.getResult());
            }

            System.out.println("Results written to results.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
