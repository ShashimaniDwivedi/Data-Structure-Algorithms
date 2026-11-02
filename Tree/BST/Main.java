public class Main {

    class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    void insert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node temp = root;

        while (true) {

            if (data < temp.data) {

                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                }

                temp = temp.left;
            } else if (data > temp.data) {

                if (temp.right == null) {
                    temp.right = newNode;
                    break;
                }

                temp = temp.right;
            } else {
                break; // Duplicate value
            }
        }
    }

    static Node search(Node root, int val) {
        while (root != null && root.data != val) {
            root = root.data > val ? root.left : root.right;
        }
        return root;
    }

    void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Main bst = new Main();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        bst.inorder(bst.root);
        Node result = search(bst.root, 20);
        if (result != null) {
            System.out.println("\nFound: " + result.data);
        } else {
            System.out.println("\nNot Found");
        }
    }
}