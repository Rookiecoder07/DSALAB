
//Traverse a graph level by level using a queue.
public class Exp24 {
    static class Node {
        int data;
        Node left, right;

Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    void levelOrderTraversal() {
        if (root == null) {
            return;
        }

java.util.Queue<Node> queue = new java.util.LinkedList<>();
queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Exp24 tree = new Exp24();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);

System.out.println("Level order traversal of binary tree is - ");
tree.levelOrderTraversal();
    }
}
