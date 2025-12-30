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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> qu1=new LinkedList<>();
        Queue<TreeNode> qu2=new LinkedList<>();

        qu1.add(root);
        qu2.add(root);
        while((!qu1.isEmpty()) && (!qu2.isEmpty())){
            TreeNode pnode=qu1.poll();
            TreeNode qnode=qu2.poll();
            if((pnode==null) && (qnode==null)){
                continue;
            }
            if(pnode==null || qnode==null || pnode.val!=qnode.val){
                return false;
            }
            qu1.add(pnode.left);
            qu2.add(qnode.right);
            qu1.add(pnode.right);
            qu2.add(qnode.left);

        }
        return true;
    }
}