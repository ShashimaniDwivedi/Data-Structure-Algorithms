import java.util.*;

public class BinaryTree {

    static class Node {
        int data = 0;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root) {
        // it give sorted data for binary search tree
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void levelOrderTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current = q.remove();
            System.out.print(current.data + " ");
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }

        }

    }

    public static int height(Node root) {

        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int sizeBinaryTree(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + sizeBinaryTree(root.left) + sizeBinaryTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println("PreOrder Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        postOrder(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("Height of Binary Tree is : " + height(root));
        System.out.println("Total Node in Binary Tree is : " + sizeBinaryTree(root));
    }
}