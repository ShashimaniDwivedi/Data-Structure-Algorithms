public class circular {

    static int cap;
    static int front = -1;
    static int rear = -1;
    static int[] arr;

    circular(int x) {
        cap = x;
        arr = new int[cap];
    }

    // INSERT
    public static void enqueue(int data) {

        // Queue full
        if ((rear + 1) % cap == front) {
            System.out.println("Overflow");
            return;
        }

        // First element
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % cap;
        arr[rear] = data;
    }

    // DELETE
    public static int dequeue() {

        // Queue empty
        if (front == -1) {
            System.out.println("Underflow");
            return -1;
        }

        int x = arr[front];

        // Only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }

        // More elements
        else {
            front = (front + 1) % cap;
        }

        return x;
    }

    // DISPLAY
    public static void display() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % cap;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        circular q = new circular(5);

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        System.out.println("Deleted: " + dequeue());
        System.out.println("Deleted: " + dequeue());

        enqueue(50);
        enqueue(60);
        enqueue(70);

        display();
    }
}