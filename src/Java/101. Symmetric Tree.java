/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 递归
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode p, TreeNode q)
    {
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        if(p == null && q == null) return true;
        return p.val == q.val && dfs(p.left, q.right) && dfs(p.right, q.left);
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 迭代  队列
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(q.size() > 1){
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val != right.val) return false;
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 栈
 * 用栈模拟递归，对根节点的左子树，我们用中序遍历；对根节点的右子树，我们用反中序遍历。
 * 则两个子树互为镜像，当且仅当同时遍历两课子树时，对应节点的值相等。
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        TreeNode left = root.left;
        TreeNode right = root.right;
        while(true)
        {
            while (left != null && right != null)
            {
                leftStack.push(left);
                rightStack.push(right);
                left = left.left;
                right = right.right;
            }
            if (left != null || right != null) {
                return false;
            }
            if (leftStack.isEmpty() && rightStack.isEmpty()) {
                break;
            }
            left = leftStack.pop();
            right = rightStack.pop();
            if (left.val != right.val) return false;
            left = left.right;
            right = right.left;
        }

        return true;
    }
}