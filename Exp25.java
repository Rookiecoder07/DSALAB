
//Traverse a graph deeply along each branch using recursion or a stack.
public class Exp25 {
    static class Node {
        int data;
        Node left, right;

Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    void depthFirstTraversal() {
depthFirstTraversalRec(root);
    }

    void depthFirstTraversalRec(Node node) {
        if (node == null) {
            return;
        }
System.out.print(node.data + " ");
depthFirstTraversalRec(node.left);
depthFirstTraversalRec(node.right);
    }

    public static void main(String[] args) {
        Exp25 tree = new Exp25();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);

System.out.println("Depth first traversal of binary tree is - ");
tree.depthFirstTraversal();
    }
}
