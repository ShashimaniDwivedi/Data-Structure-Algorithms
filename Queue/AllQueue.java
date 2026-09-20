import java.util.Arrays;

public class AllQueue {

    // ================= LINEAR QUEUE =================
    static class LinearQueue {
        int[] arr;
        int front = 0;
        int rear = -1;
        int cap;

        LinearQueue(int cap) {
            this.cap = cap;
            arr = new int[cap];
        }

        void enqueue(int value) {
            if (rear == cap - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            arr[++rear] = value;
        }

        void dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
                return;
            }
            System.out.println("Deleted: " + arr[front++]);
        }

        void peek() {
            if (front > rear) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("Front: " + arr[front]);
        }

        void display() {
            if (front > rear) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


    // ================= CIRCULAR QUEUE =================
    static class CircularQueue {
        int[] arr;
        int front = -1;
        int rear = -1;
        int cap;

        CircularQueue(int cap) {
            this.cap = cap;
            arr = new int[cap];
        }

        boolean isFull() {
            return (rear + 1) % cap == front;
        }

        boolean isEmpty() {
            return front == -1;
        }

        void enqueue(int value) {
            if (isFull()) {
                System.out.println("Circular Queue Overflow");
                return;
            }

            if (isEmpty()) {
                front = 0;
            }

            rear = (rear + 1) % cap;
            arr[rear] = value;
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Circular Queue Underflow");
                return;
            }

            System.out.println("Deleted: " + arr[front]);

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % cap;
            }
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println("Front: " + arr[front]);
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            int i = front;

            while (true) {
                System.out.print(arr[i] + " ");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % cap;
            }

            System.out.println();
        }
    }


    // ================= DEQUE =================
    static class Deque {
        int[] arr;
        int front = -1;
        int rear = -1;
        int cap;

        Deque(int cap) {
            this.cap = cap;
            arr = new int[cap];
        }

        boolean isEmpty() {
            return front == -1;
        }

        boolean isFull() {
            return (rear + 1) % cap == front;
        }

        void insertFront(int value) {
            if (isFull()) {
                System.out.println("Deque Overflow");
                return;
            }

            if (isEmpty()) {
                front = rear = 0;
            } else {
                front = (front - 1 + cap) % cap;
            }

            arr[front] = value;
        }

        void insertRear(int value) {
            if (isFull()) {
                System.out.println("Deque Overflow");
                return;
            }

            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % cap;
            }

            arr[rear] = value;
        }

        void deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque Underflow");
                return;
            }

            System.out.println("Deleted: " + arr[front]);

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % cap;
            }
        }

        void deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque Underflow");
                return;
            }

            System.out.println("Deleted: " + arr[rear]);

            if (front == rear) {
                front = rear = -1;
            } else {
                rear = (rear - 1 + cap) % cap;
            }
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Deque is Empty");
                return;
            }

            int i = front;

            while (true) {
                System.out.print(arr[i] + " ");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % cap;
            }

            System.out.println();
        }
    }


    // ================= PRIORITY QUEUE =================
    static class PriorityQueue {
        int[] arr;
        int size = 0;
        int cap;

        PriorityQueue(int cap) {
            this.cap = cap;
            arr = new int[cap];
        }

        void enqueue(int value) {
            if (size == cap) {
                System.out.println("Priority Queue Overflow");
                return;
            }

            int i = size - 1;

            while (i >= 0 && arr[i] > value) {
                arr[i + 1] = arr[i];
                i--;
            }

            arr[i + 1] = value;
            size++;
        }

        void dequeue() {
            if (size == 0) {
                System.out.println("Priority Queue Underflow");
                return;
            }

            // Smallest value has highest priority
            System.out.println("Deleted: " + arr[0]);

            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--;
        }

        void peek() {
            if (size == 0) {
                System.out.println("Priority Queue is Empty");
                return;
            }

            System.out.println("Highest Priority: " + arr[0]);
        }

        void display() {
            if (size == 0) {
                System.out.println("Priority Queue is Empty");
                return;
            }

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }


    // ================= MAIN MENU =================

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        LinearQueue linear = new LinearQueue(5);
        CircularQueue circular = new CircularQueue(5);
        Deque deque = new Deque(5);
        PriorityQueue priority = new PriorityQueue(5);

        while (true) {

            System.out.println("\n========== QUEUE MENU ==========");
            System.out.println("1. Linear Queue");
            System.out.println("2. Circular Queue");
            System.out.println("3. Deque");
            System.out.println("4. Priority Queue");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Program Ended");
                break;
            }

            switch (choice) {

                // -------- LINEAR QUEUE --------
                case 1:

                    while (true) {
                        System.out.println("\n--- Linear Queue ---");
                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. Peek");
                        System.out.println("4. Display");
                        System.out.println("5. Back");

                        System.out.print("Enter choice: ");
                        int ch = sc.nextInt();

                        switch (ch) {

                            case 1:
                                System.out.print("Enter value: ");
                                linear.enqueue(sc.nextInt());
                                break;

                            case 2:
                                linear.dequeue();
                                break;

                            case 3:
                                linear.peek();
                                break;

                            case 4:
                                linear.display();
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        if (ch == 5)
                            break;
                    }

                    break;


                // -------- CIRCULAR QUEUE --------
                case 2:

                    while (true) {
                        System.out.println("\n--- Circular Queue ---");
                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. Peek");
                        System.out.println("4. Display");
                        System.out.println("5. Back");

                        System.out.print("Enter choice: ");
                        int ch = sc.nextInt();

                        switch (ch) {

                            case 1:
                                System.out.print("Enter value: ");
                                circular.enqueue(sc.nextInt());
                                break;

                            case 2:
                                circular.dequeue();
                                break;

                            case 3:
                                circular.peek();
                                break;

                            case 4:
                                circular.display();
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        if (ch == 5)
                            break;
                    }

                    break;


                // -------- DEQUE --------
                case 3:

                    while (true) {
                        System.out.println("\n--- Deque ---");
                        System.out.println("1. Insert Front");
                        System.out.println("2. Insert Rear");
                        System.out.println("3. Delete Front");
                        System.out.println("4. Delete Rear");
                        System.out.println("5. Display");
                        System.out.println("6. Back");

                        System.out.print("Enter choice: ");
                        int ch = sc.nextInt();

                        switch (ch) {

                            case 1:
                                System.out.print("Enter value: ");
                                deque.insertFront(sc.nextInt());
                                break;

                            case 2:
                                System.out.print("Enter value: ");
                                deque.insertRear(sc.nextInt());
                                break;

                            case 3:
                                deque.deleteFront();
                                break;

                            case 4:
                                deque.deleteRear();
                                break;

                            case 5:
                                deque.display();
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        if (ch == 6)
                            break;
                    }

                    break;


                // -------- PRIORITY QUEUE --------
                case 4:

                    while (true) {
                        System.out.println("\n--- Priority Queue ---");
                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. Peek");
                        System.out.println("4. Display");
                        System.out.println("5. Back");

                        System.out.print("Enter choice: ");
                        int ch = sc.nextInt();

                        switch (ch) {

                            case 1:
                                System.out.print("Enter value: ");
                                priority.enqueue(sc.nextInt());
                                break;

                            case 2:
                                priority.dequeue();
                                break;

                            case 3:
                                priority.peek();
                                break;

                            case 4:
                                priority.display();
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid Choice");
                        }

                        if (ch == 5)
                            break;
                    }

                    break;


                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}