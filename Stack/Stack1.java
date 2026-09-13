import java.util.*;

class MyStack {
    int[] arr;
    int top = -1;
    int cap;

    MyStack(int a) {
        cap = a;
        arr = new int[cap];
    }

    // Push operation
    public void push(int temp) {

        if (top == cap - 1) {
            System.out.println("Stack is Full");
            return;
        }

        top++;
        arr[top] = temp;

        System.out.printf("%d added to Stack%n", arr[top]);
    }

    // Pop operation
    public int pop() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int a = arr[top];
        top--;

        return a;
    }
}

public class Stack1 {

    public static void main(String[] args) {

        MyStack m = new MyStack(5);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Stack Operation ---");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. EXIT");
            System.out.print("Choose Option: ");

            int opt = sc.nextInt();

            switch (opt) {

                case 1 -> {
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    m.push(value);
                }

                case 2 -> {
                    int value = m.pop();

                    if (value != -1) {
                        System.out.println("Popped: " + value);
                    }
                }

                case 3 -> {
                    System.out.println("Program Exit");
                    return;
                }

                default -> System.out.println("Invalid Option");
            }
        }
    }
}