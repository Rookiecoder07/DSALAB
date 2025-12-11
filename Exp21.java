// Write a program to implement Circular Queue operations push, pop, isEmpty and isFull using array.

public class Exp21 {

    static class CircularQueue {
        int maxSize;
        int[] queueArray;
        int front, rear, size;

        CircularQueue(int size) {
            this.maxSize = size;
            this.queueArray = new int[maxSize];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }

        void push(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + value);
            } else {
                rear = (rear + 1) % maxSize;
                queueArray[rear] = value;
                size++;
                System.out.println("Enqueued " + value + " to queue.");
            }
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1;  // queue empty
            } else {
                int value = queueArray[front];
                front = (front + 1) % maxSize;
                size--;
                return value;
            }
        }

        boolean isEmpty() {
            return (size == 0);
        }

        boolean isFull() {
            return (size == maxSize);
        }
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Dequeued element: " + queue.pop());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
    }
}
