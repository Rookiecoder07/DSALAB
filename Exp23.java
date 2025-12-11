// Write a program to implement BST. Write a function to insert, delete and search from BST.
public class Exp23 {

    // Node structure
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    // Insert key into BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Delete key from BST
    int delete(int key) {
        root = deleteRec(root, key);
        return key;
    }

    Node deleteRec(Node root, int key) {

        if (root == null)
            return root;

        if (key < root.data)
            root.left = deleteRec(root.left, key);

        else if (key > root.data)
            root.right = deleteRec(root.right, key);

        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            // Node with two children → get inorder successor
            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            root = root.left;
            minv = root.data;
        }
        return minv;
    }

    // Search for a key
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        return key < root.data ?
                searchRec(root.left, key) :
                searchRec(root.right, key);
    }

    public static void main(String[] args) {
        Exp23 tree = new Exp23();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Delete nodes
        System.out.println(tree.delete(20) + " deleted from BST.");
        System.out.println(tree.delete(30) + " deleted from BST.");

        int keyToSearch = 40;

        // Search node
        if (tree.search(keyToSearch))
            System.out.println("Element " + keyToSearch + " found in the BST.");
        else
            System.out.println("Element " + keyToSearch + " not found in the BST.");
    }
}
