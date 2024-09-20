/**
 * [-10,-3,0,5,9]
 * This takes the mid of the sorted array, sets it as the root of the tree
 * i.e 0 is now the root, then takes the left of that root, i.e [-10,-3]
 * takes the mid of that i.e -10, sets that as the new root of the root.left
 * ...etc
 * until it reacehs the end of the array. making a BTS height based Tree
 */
public class ConvertSortedArraytoBinarySearchTree {

    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };
        Solution sol = new Solution();
        TreeNode root = sol.sortedArrayToBST(nums);
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
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

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return RecTreeNodeBTS(nums, 0, nums.length - 1);
    }

    public TreeNode RecTreeNodeBTS(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = RecTreeNodeBTS(nums, left, mid - 1);
        root.right = RecTreeNodeBTS(nums, mid + 1, right);
        return root;
    }
}
