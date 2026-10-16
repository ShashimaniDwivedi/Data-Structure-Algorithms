/* class SortStack1 {
    int cap;
    int[] arr;
    int[] temp;
    int top = -1;

    SortStack1(int cap) {
        this.cap = cap;
        arr = new int[cap];
        temp = new int[cap];
    }

    public int push(int temp) {
        if (top == cap - 1) {
            System.out.println("Overflow");
            return;
        }
        top++;
        int a = arr[top] = temp;
        return a;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("UnderFlow");
            return -1;
        }
        int b = arr[top];
        top--;
        return b;
    }

    public void sortStack() {

        int tempTop = -1;

        while (top != -1) {

            int x = pop();

            while (tempTop != -1 && temp[tempTop] > x) {
                push(temp[tempTop]);
                tempTop--;
            }

            temp[++tempTop] = x;
        }

        // temp is now sorted
    }

    public static void main(String[] args) {
        SortStack1 s = new SortStack1(5);

        s.push(5);
        s.push(13);
        s.push(4);
        s.push(45);
        s.push(15);
        System.out.println("Before Stack");
        for (int i = 0; i <= 4; i++) {
            System.out.println(s.arr[i]);
        }
        s.sortStack();
        System.out.println("After Stack");

        for (int i = 0; i <= 4; i++) {
            System.out.println(s.temp[i]);
        }
    }
} */

public class SortStack1 {
    int[] arr;
    int[] temp;
    int cap;
    int top = -1;

    SortStack1(int cap) {
        this.cap = cap;
        arr = new int[cap];
        temp = new int[cap];
    }

    public void push(int value) {
        if (top == cap - 1) {
            System.out.println("OverFlow");
            return;
        }
        top++;
        arr[top] = value;
    }

    public int pop(int ar[]) {
        if (top == -1) {
            System.out.println("UnderFlow");
            return -1;
        }
        int a = ar[top--];
        return a;

    }

    public void sort() {
       int tempTop=-1;
        while (top != -1) {
            int x = pop(arr);
            while (tempTop != -1 && temp[tempTop]>x) {
                push(temp[tempTop--]);
            }
            temp[++tempTop] = x;

        }
    }

    public static void main(String[] args) {
        SortStack1 s = new SortStack1(5);
        s.push(5);
        s.push(1);
        s.push(6);
        s.push(-11);
        s.push(33);
        System.out.println("Stack Before Sorting");
        for (int i : s.arr) {
            System.out.println(i);
        }
        s.sort();
        for (int i = 0; i < s.cap; i++) {
            s.arr[i] = s.temp[i];
        }
        System.out.println("Stack After Sorting");
        for (int i : s.arr) {
            System.out.println(i);
        }
    }
}