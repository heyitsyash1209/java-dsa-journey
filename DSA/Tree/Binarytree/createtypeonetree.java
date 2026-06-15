package DSA.Tree.Binarytree;
//INORDER TREE ---- left -- Node -- right
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class createtypeonetree {

    Node root;

    // 🌳 Inorder Traversal
    void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        createtypeonetree tree = new createtypeonetree();

        // 🌱 Creating simple tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // 👇 print tree
        tree.inorder(tree.root);
    }

    public void preorder(Node root2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preorder'");
    }
}