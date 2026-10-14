public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int findMax(Node root) {
        if (root == null)
            return -1;
        while (root.right != null) {
            root = root.right;
        }
        return (root.data);

    }

    public static int findMin(Node root) {
        if (root == null)
            return -1;
        while (root.left != null) {
            root = root.left;
        }
        return (root.data);
    }

    public static boolean search(Node root, int k) {
        if (root == null)
            return false;
        while (root != null) {
            if (root.data == k) {
                return true;
            } else if (root.data > k) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(12);
        root.left.left = new Node(5);
        root.left.right = new Node(9);
        System.out.println(findMax(root));
        System.out.println(findMin(root));
        System.out.println("Element is Present in Tree : " + search(root, 12));

    }

}
