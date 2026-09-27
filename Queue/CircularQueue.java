class CircularQueue {
    int[] arr;
    int cap;
    int front = -1, rear = -1;

    CircularQueue(int cap) {
        this.cap = cap;
        arr = new int[cap];
    }

    public void enqueue(int data) {
        if (front == (rear + 1) % cap) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1)
            front = 0;
        rear = (rear + 1) % cap;
        arr[rear] = data;
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("UnderFlow");
            return;
        }
        System.out.println("Deleted Element is :" + arr[front]);
        if (front == rear) {
            front = rear = -1;
        } else
            front = (front + 1) % cap;
    }

    public void display() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(arr[i] + " ");
            //Stop at rear 
            if (i == rear) {
                break;
            }

            i = (i + 1) % cap;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.dequeue();
        c.dequeue();
        c.enqueue(4);
        c.enqueue(5);
        c.enqueue(6);
        c.display();
    }
}