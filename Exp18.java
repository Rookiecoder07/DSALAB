
//Write a program to implement doubly linked list and display data of all nodes.
public class Exp18 {
    Node head; // head of list
    static class Node {
        int data;
        Node prev;
        Node next;

Node(int d) {
            data = d;
prev = null;
            next = null;
        }
    }

    // Insert a new node at the end
    public void insert(int data) {
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
newNode.prev = temp;
    }
    //Display the linked list
    public void display() {
        Node temp = head;
System.out.println("Doubly Linked List:");
        while (temp != null) {
System.out.print(temp.data + " ");
            temp = temp.next;
        }
System.out.println();
    }
    public static void main(String[] args) {
        Exp18 list = new Exp18();
list.insert(10);
list.insert(20);    
list.insert(30);
list.insert(40);
list.display();
    }
}
