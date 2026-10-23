
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    // Inorder traversal
    private static void inorder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }

        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    // Build balanced BST from sorted array
    private static TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);

        return root;
    }

    // Merge two BSTs into one balanced BST
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        List<Integer> arr = new ArrayList<>();

        inorder(root1, arr);
        inorder(root2, arr);

        Collections.sort(arr);

        int[] nums = arr.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();

        return buildBST(nums, 0, nums.length - 1);
    }

    // Print inorder traversal
    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // Main method
    public static void main(String[] args) {

        // First BST
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);

        // Second BST
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        TreeNode result = mergeTrees(root1, root2);

        System.out.println("Inorder of merged balanced BST:");
        printInorder(result);
    }
}
