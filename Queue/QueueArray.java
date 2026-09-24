public class QueueArray {

    int[] arr;
    int cap;
    int front = -1;
    int rear = -1;

    QueueArray(int cap) {
        this.cap = cap;
        arr = new int[cap];
    }

    // Insert
    public void enqueue(int value) {
        if (rear == cap - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1){
        front++;
        }
        arr[++rear] = value;
    }

    // Remove
    public int dequeue() {
        if (front > rear||front==-1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        
        return arr[front++];
    }

    // Get front element
    public int peek() {
        if (front > rear||front==-1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    // Display
    public void display() {
        if (front > rear||front==-1) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue:");
        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.display();

        System.out.println("Front: " + q.peek());
    }
} 
