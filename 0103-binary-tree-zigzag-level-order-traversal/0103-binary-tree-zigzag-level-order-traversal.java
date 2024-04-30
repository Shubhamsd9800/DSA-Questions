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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root == null ){
          return res;
        }
        Queue<TreeNode> qe= new LinkedList<>();
        qe.add(root);
        boolean leftright=true;
        while(!qe.isEmpty()){
          int size=qe.size();
          List<Integer> row = new ArrayList<>();
          for(int i=0;i<size;i++){
            TreeNode node= qe.peek();
            row.add(node.val);
            if(node.left!=null){
              qe.add(node.left);
            } 
            if(node.right!=null){
              qe.add(node.right);
            }
            qe.remove();
          }
          if(!leftright){
            Collections.reverse(row);
          }
          res.add(row);
          leftright=!leftright;
          
        }

       
        return res;

    }
}