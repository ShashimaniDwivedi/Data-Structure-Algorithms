public class LinearQueue {
    static int cap;
    static int front = -1;
    static int rear = -1;
    static int[] arr;

    LinearQueue(int x) {
        cap = x;
        arr = new int[cap];
    }

    // INSERT
    public static void enqueue(int data) {
        if (rear == cap - 1) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    // DELETE
    public static int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return -1;
        }

        int x = arr[front];
        front++;
        // reset queue when last element get deleted
        if (front > rear) {
            front = -1;
            rear = -1;
        }

        return x;
    }

    // DISPLAY
    public static void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue l = new LinearQueue(5);

        enqueue(5);
        enqueue(23);
        enqueue(2);
        enqueue(4);
        enqueue(1);

        enqueue(1); // Overflow

        dequeue();
        dequeue();
        dequeue();
        dequeue();

        display();
    }
}