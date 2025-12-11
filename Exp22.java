//Write a program to implement in-order, pre-order and post-order traversal of binary tree.
public class Exp22 {
    static class Node {
        int data;
        Node left, right;

Node(int item) {
            data = item;
            left = right = null;
        }
    }
    Node root;
    void printInOrder(Node node) {
        if (node == null)
            return;
printInOrder(node.left);
System.out.print(node.data + " ");
printInOrder(node.right);
    }
    void printPreOrder(Node node) {
        if (node == null)
            return;
System.out.print(node.data + " ");
printPreOrder(node.left);
printPreOrder(node.right);
    }
    void printPostOrder(Node node) {
        if (node == null)
            return;
printPostOrder(node.left);
printPostOrder(node.right);
System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Exp22 tree = new Exp22();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);

System.out.println("In-order traversal:");
tree.printInOrder(tree.root);
System.out.println();

System.out.println("Pre-order traversal:");
tree.printPreOrder(tree.root);
System.out.println();

System.out.println("Post-order traversal:");
tree.printPostOrder(tree.root);
System.out.println();
    }
}
