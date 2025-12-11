// Write a menu driven program to implement Single Linked List for operations :
// Insert (start, end and at position), Delete (start, end and at position), Search, and Display

import java.util.Scanner;

public class Exp17 {

    // Node Class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at Start
    private void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at Position
    private void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at Start
    private void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete at End
    private void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at Position
    private void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search
    private void search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
    }

    // Display
    private void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main Function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exp17 list = new Exp17();

        System.out.println("Menu Driven Linked List Program");
        System.out.println("--------------------------------");

        System.out.println("Enter number of operations you want to perform: ");
        int times = sc.nextInt();

        while (times-- > 0) {
            System.out.println("\nChoose Operation:");
            System.out.println("1 → Insert at Start");
            System.out.println("2 → Insert at End");
            System.out.println("3 → Insert at Position");
            System.out.println("4 → Delete at Start");
            System.out.println("5 → Delete at End");
            System.out.println("6 → Delete at Position");
            System.out.println("7 → Search");
            System.out.println("8 → Display");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtStart(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    break;

                case 4:
                    list.deleteAtStart();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    list.deleteAtPosition(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    list.search(sc.nextInt());
                    break;

                case 8:
                    list.display();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
