package DSA.Tree.Binarytree;

// POSTORDER ---> left -- right -- root
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class createtypethree {

    Node root;

    // Postorder Traversal
    void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);   // left
        postorder(node.right);  // right
        System.out.print(node.data + " "); // root
    }

    public static void main(String[] args) {

        createtypethree tree = new createtypethree();

        // creating tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // print postorder
        tree.postorder(tree.root);
    }
}