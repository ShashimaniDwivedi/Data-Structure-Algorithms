class SortStack {
    int cap;
    int[] arr;
    int[] temp;
    int top = -1;

    SortStack(int cap) {
        this.cap = cap;
        arr = new int[cap];
        temp = new int[cap];
    }

    public int push(int temp) {
        if (top == cap - 1) {
            System.out.println("Overflow");
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

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public void sortStack() {

        int t = -1;

        while (top != -1) {

            int x = pop();
            temp[++t] = x;

            int i = t;

            while (i > 0 && temp[i] < temp[i - 1]) {
                swap(temp, i, i - 1);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        SortStack s = new SortStack(5);

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
}