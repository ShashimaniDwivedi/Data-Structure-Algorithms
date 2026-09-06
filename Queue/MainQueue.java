public class MainQueue {

    static class QueueBase {
        int[] arr;
        int cap;
        int front = -1;
        int rear = -1;

        QueueBase(int cap) {
            this.cap = cap;
            arr = new int[cap];
        }
    }

    static class LinearQueue extends QueueBase {

        LinearQueue(int cap) {
            super(cap);
        }

        public void enqueue(int data) {
            if (rear == cap - 1) {
                System.out.println("OverFlow");
                return;
            }
            if (front == -1) {
            }
            front = 0;
            arr[++rear] = data;

        }

        public void dequeue() {
            if (front == -1) {
                System.out.println("UnderFlow");
                return;
            }
            System.out.println("Deleted Element is : " + arr[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }

        }

        public void display() {

            if (front == -1) {
                System.out.println("Queue is Empty");
                return;
            }
            int i = front;
            System.out.println("Displaying Element of Queue");
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear)
                    break;
                i++;
            }
            System.out.println();
        }
    }

    static class CircularQueue extends QueueBase {

        CircularQueue(int cap) {
            super(cap);
        }

        public boolean isFull() {
            return ((rear + 1) % cap == front);
        }

        public boolean isEmpty() {
            return front == -1 ? true : false;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % cap;
            arr[rear] = data;

        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("UnderFlow");
                return;
            }
            System.out.println("Deleted Element is : " + arr[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % cap;
            }

        }

        public void display() {

            if (front == -1) {
                System.out.println("Queue is Empty");
                return;
            }
            int i = front;
            System.out.println("Displaying Element of Queue");
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear)
                    break;
                i++;
            }
            System.out.println();
        }
    }

    static class DeQueue extends QueueBase {

        DeQueue(int cap) {
            super(cap);
        }

        public boolean isFull() {
            return ((rear + 1) % cap == front);
        }

        public boolean isEmpty() {
            return front == -1 ? true : false;
        }

        public void insertRear(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % cap;
            arr[rear] = data;

        }

        public void insertFront(int data) {
            if (isFull()) {
                System.out.println("OverFlow");
                return;
            }
            if (front == -1) {
                front = rear = 0;
            } else {
                front = (front - 1 + cap) % cap;
            }
            arr[front] = data;
        }

        public void deleteRear() {
            if (isEmpty()) {
                System.out.println("UnderFlow");
                return;
            }
            System.out.println("Deleted Element is : " + arr[rear]);
            if (front == rear) {
                front = rear = -1;
            } else {
                rear = (rear - 1 + cap) % cap;
            }

        }

        public void deleteFront() {
            if (isEmpty()) {
                System.out.println("UnderFlow");
                return;
            }
            System.out.println("Deleted Element is : " + arr[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % cap;
            }
        }

        public void display() {

            if (front == -1) {
                System.out.println("Queue is Empty");
                return;
            }
            int i = front;
            System.out.println("Displaying Element of Queue");
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % cap;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        LinearQueue lq = new LinearQueue(5);
        System.out.println("****Linear QUEUE****");
        lq.enqueue(5);
        lq.enqueue(12);
        lq.enqueue(8);
        lq.enqueue(4);
        lq.enqueue(23);
        lq.dequeue();
        lq.dequeue();
        lq.dequeue();
        lq.dequeue();
        lq.dequeue();
        lq.display();
        System.out.println("****CIRCULAR QUEUE****");
        CircularQueue cq = new CircularQueue(6);
        cq.enqueue(5);
        cq.enqueue(12);
        cq.enqueue(8);
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(4);
        cq.enqueue(23);
        cq.enqueue(13);
        cq.display();
        DeQueue dq = new DeQueue(8);
        System.out.println("****DOUBLY ENDED QUEUE****");
        dq.insertFront(5);
        dq.insertFront(67);
        dq.insertFront(2);
        dq.insertRear(8);
        dq.insertRear(45);
        dq.insertFront(34);
        dq.insertRear(56);
        dq.deleteFront();
        dq.deleteRear();
        dq.display();
    }
}