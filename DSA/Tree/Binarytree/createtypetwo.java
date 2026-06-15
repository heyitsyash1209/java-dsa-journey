package DSA.Tree.Binarytree;

// PREORDER ---> root -- left -- right
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class createtypetwo {

    Node root;

    void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {

        // ✅ correct class name here
        createtypetwo tree = new createtypetwo();

        //  creating tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        //  print preorder
        tree.preorder(tree.root);
    }
}