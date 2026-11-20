
#include <stdio.h>
#define MAX 100

int s1[MAX], s2[MAX];
int top1 = -1, top2 = -1;

void push1(int x) {
    s1[++top1] = x;
}

void push2(int x) {
    s2[++top2] = x;
}

int pop1() {
    return s1[top1--];
}

int pop2() {
    return s2[top2--];
}

void sortStack() {

    while (top1 != -1) {

        int temp = pop1();

        push2(temp);

        int j = top2;

        // Sort using swapping
        while (j > 0 && s2[j] > s2[j - 1]) {

            int t = s2[j];
            s2[j] = s2[j - 1];
            s2[j - 1] = t;

            j--;
        }
    }

    // Transfer back to original stack
    while (top2 != -1) {
        push1(pop2());
    }
}

void display() {
    for (int i = 0; i <= top1; i++) {
        printf("%d ", s1[i]);
    }
    printf("\n");
}

int main() {

    push1(30);
    push1(10);
    push1(50);
    push1(20);
    push1(40);

    printf("Before sorting: ");
    display();

    sortStack();

    printf("After sorting: ");
    display();

    return 0;
}
