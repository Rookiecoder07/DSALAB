
//Write a program to implement circular linked list and display data of all nodes.
public class Exp19 {
    Node head;
    static class Node {
        int data;
        Node next;

Node(int d) {
            data = d;
            next = null;
        }
    }
    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
newNode.next = head; // Point to itself to make it circular
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
temp.next = newNode;
newNode.next = head; // Make it circular
    }
    //Display the circular linked list
    public void display() {
        if (head == null) {
System.out.println("List is empty.");
            return;
        }
        Node temp = head;
System.out.println("Circular Linked List:");
        do {
System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
System.out.println();
    }
    public static void main(String[] args) {
        Exp19 list = new Exp19();
list.insert(10);
list.insert(20);    
list.insert(30);
list.insert(40);
list.display();
    }
}
