
import java.util.ArrayList;

public class PrintBoundary {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean checkLeaf(Node root) {
        return root != null &&
                root.left == null &&
                root.right == null;
    }

    public void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.left;

        while (curr != null) {
            if (!checkLeaf(curr))
                res.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    public void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();

        while (curr != null) {
            if (!checkLeaf(curr))
                tmp.add(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        for (int i = tmp.size() - 1; i >= 0; i--) {
            res.add(tmp.get(i));
        }
    }

    public void addLeaf(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;

        if (checkLeaf(root)) {
            res.add(root.data);
            return;
        }

        addLeaf(root.left, res);
        addLeaf(root.right, res);
    }

    public ArrayList<Integer> printBoundary(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        if (!checkLeaf(root))
            ans.add(root.data);

        addLeftBoundary(root, ans);
        addLeaf(root, ans);
        addRightBoundary(root, ans);

        return ans;
    }

    public static void main(String[] args) {
        PrintBoundary obj = new PrintBoundary();

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);

        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        System.out.println(obj.printBoundary(root));
    }
}
