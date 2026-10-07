public class Dequeue {
    int[] arr;
    int cap;
    int front = -1, rear = -1;

    Dequeue(int cap) {
        this.cap = cap;
        arr = new int[cap];
    }

    public void insertRear(int data) {
        if((rear+1)%cap==front){
            System.out.println("OverFlow");
            return;
        }
        if(front==-1){
            front=rear=0;
        }else{
        rear=(rear+1)%cap;
        }
        arr[rear]=data;
    }

    public void insertFront(int data) {
        if ((rear + 1) % cap == front) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            front = (front - 1 + cap) % cap;
        }
        arr[front]=data;
    }

    public void deleteRear() {
          if (front==-1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Deleted element is : "+arr[rear]);
        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + cap) % cap;
        }
    }

    public void deleteFront() {
        if (front==-1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Deleted element is : "+arr[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front=(front+1) % cap;
        }
    }

    public void display() {
         if (front==-1) {
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

    }

    public static void main(String[] args) {
        Dequeue d = new Dequeue(5);
        d.insertRear(5);
        d.insertRear(23);
        d.insertFront(15);
        d.insertFront(45);
        d.deleteRear();
        d.deleteFront();
        d.display();
    }
}
