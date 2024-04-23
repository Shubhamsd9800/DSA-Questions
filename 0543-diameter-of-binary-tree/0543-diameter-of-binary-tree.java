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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia= new int[1];
        height(dia,root);
        return dia[0];
    }

    public static int height(int[] dia, TreeNode node){
      if(node==null){
        return 0;
      }
      int lh=height(dia,node.left);
      int rh=height(dia,node.right);
      dia[0]=Math.max(dia[0],lh+rh);
      return 1+Math.max(lh,rh);
    }
}