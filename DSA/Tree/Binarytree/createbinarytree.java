package DSA.Tree.Binarytree;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class createbinarytree {
    Node root;

    // 👇 Preorder traversal
    void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        createbinarytree tree = new createbinarytree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // 👇 all values print together
        tree.preorder(tree.root);
        
    }

    public void inorder(Node root2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inorder'");
    }
}