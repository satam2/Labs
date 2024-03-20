public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            invertTree(root.left);
            root.left = temp;
            invertTree(temp);
        }
        return root;
    }

    public static void main(String[] args) {
        // testing
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode n8 = new TreeNode(8, n5, n6);
        TreeNode n1 = new TreeNode(1, n2, n8);

        System.out.println("before inversion: ");
        System.out.println("1's children-- l: " + n1.left.val + " r: " + n1.right.val);
        System.out.println("2's children-- l: " + n2.left.val + " r: " + n2.right);
        System.out.println("8's children-- l: " + n8.left.val + " r: " + n8.right.val);
        System.out.println("\nafter inversion: ");
        System.out.println("the root is " + n1.invertTree(n1).val);
        System.out.println("1's children-- l: " + n1.left.val + " r: " + n1.right.val);
        System.out.println("2's children-- l: " + n2.left + " r: " + n2.right.val);
        System.out.println("8's children-- l: " + n8.left.val + " r: " + n8.right.val);
    }
}
