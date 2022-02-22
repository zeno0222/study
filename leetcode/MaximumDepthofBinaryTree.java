
/**
 * 2022. 02. 14
 * 104. Maximum Depth of Binary Tree
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
*/


import javax.swing.tree.TreeNode;

/**
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 */



public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {

    }

    public static int cntDepth(TreeNode node, int depth){
        if(node == null)
            return depth;
        return 1;
//        return Math.max(cntDepth(node.left, depth+1),cntDepth(node.right, depth+1));
    }
    public static int maxDepth(TreeNode root) {
        int cnt = cntDepth(root, 0);
        return cnt;
    }



}