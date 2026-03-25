package solutions;

import java.util.*;

public class BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if (root == null) return ans;
        q.offer(root);
        while (!q.isEmpty()) {
            int lvl = q.size();
            List<Integer> temp = new LinkedList<Integer>();
            for (int i = 0; i < lvl; i++) {
                if (q.peek().left != null) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                temp.add(q.poll().val);
            }
            ans.add(temp);
        }
        return ans;
    }
}
