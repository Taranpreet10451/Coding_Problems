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
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return result;
        order(root,0);
        return result;
    }
    private void order(TreeNode root,int l){
        if(root==null)
            return;
        if(l==result.size())
            result.add(new ArrayList<>());
        if(root!=null)
            result.get(l).add(root.val);
        order(root.left,l+1);
        order(root.right,l+1);
    }
}