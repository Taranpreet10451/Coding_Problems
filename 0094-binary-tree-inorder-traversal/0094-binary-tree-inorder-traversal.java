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
class Solution {
    List<Integer> result=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return result;
        order(root);
        return result;
    }
    private void order(TreeNode root){
        if(root==null)
            return;
        order(root.left);
        result.add(root.val);
        order(root.right);
    }
}