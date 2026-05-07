package solutions;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return chkheight(root) != -1;
    }

    private int chkheight(TreeNode root) {
        if (root == null) return 0;
        int lh = chkheight(root.left);
        int rh = chkheight(root.right);
        if (lh == -1 || rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}
