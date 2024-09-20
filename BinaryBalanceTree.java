public class BinaryBalanceTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution sol = new Solution();
        System.out.println(sol.isBalanced(root));
    }

    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
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
    }

    static class Solution {
        public boolean isBalanced(TreeNode root) {
            if (checkBalance(root) != -1) {
                return true;
            } else {
                return false;
            }
        }

        public int checkBalance(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = checkBalance(root.left);
            int right = checkBalance(root.right);

            if (left == -1 || right == -1) {
                return -1;
            }

            if (Math.abs(left - right) > 1) {
                return -1;
            }

            return Math.max(left, right) + 1;
        }
    }

}
