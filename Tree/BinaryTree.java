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

    public static int findMin(Node root) {
        if (root == null)
            return -1;

        int min = root.data;

        int leftMin = findMin(root.left);

        int rightMin = findMin(root.right);

        if (leftMin != -1)
            min = Math.min(min, leftMin);

        if (rightMin != -1)
            min = Math.min(min, rightMin);

        return min;
    }

    public static int findMax(Node root) {
        if (root == null)
            return -1;

        int max = root.data;

        int leftMax = findMax(root.left);

        int rightMax = findMax(root.right);

        if (leftMax != -1)
            max = Math.max(max, leftMax);

        if (rightMax != -1)
            max = Math.max(max, rightMax);

        return max;
    }

    public static int search(Node root, int k) {

        if (root == null)
            return -1;

        if (root.data == k)
            return root.data;

        int left = search(root.left, k);

        if (left != -1)
            return left;

        return search(root.right, k);
    }

    public static void insert(Node root, int k) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.poll();

            // If left is empty, insert here
            if (current.left == null) {
                current.left = new Node(k);
                return;
            } else {
                q.add(current.left);
            }

            // If right is empty, insert here
            if (current.right == null) {
                current.right = new Node(k);
                return;
            } else {
                q.add(current.right);
            }
        }
    }

    public static int countNullPointer(Node root) {
        if (root == null)
            return 1;
        return countNullPointer(root.left) + countNullPointer(root.right);
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
        int min = findMin(root);
        int max = findMax(root);
        System.out.println(min + " " + max);
        System.out.println(search(root, 50));
        System.out.println(countNullPointer(root));
    }
}