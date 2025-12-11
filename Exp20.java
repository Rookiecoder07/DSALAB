// Implement stack operations (push, pop, isEmpty, isFull) using an array.

public class Exp20 {

    static class Stack {
        int maxSize;
        int[] stackArray;
        int top;

        Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }

        void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push " + value);
            } else {
                stackArray[++top] = value;
                System.out.println("Pushed " + value + " to stack.");
            }
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; // Indicating stack is empty
            } else {
                return stackArray[top--];
            }
        }

        boolean isEmpty() {
            return (top == -1);
        }

        boolean isFull() {
            return (top == maxSize - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
