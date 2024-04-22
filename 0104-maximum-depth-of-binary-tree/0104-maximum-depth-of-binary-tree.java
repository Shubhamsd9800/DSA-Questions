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

//  Another Solution using queue use of level order traversal
//  if(root==null) return 0;
      
//       Queue<TreeNode> ar= new LinkedList<>();
//       int level=0;
//       ar.add(root);
//       while(!ar.isEmpty()){
//         int size= ar.size();
//         for(int i=0;i<size;i++){
//           TreeNode ro=ar.remove();
//           if(ro.left!=null){
//             ar.add(ro.left);
//           }
//           if(ro.right!=null){
//             ar.add(ro.right);
//           }
//         }
//         level++;
//       }

//       return level;

class Solution {
    public int maxDepth(TreeNode root) {
      if(root==null) return 0;

      int lh=maxDepth(root.left);
      int rh=maxDepth(root.right);

      return 1+Math.max(lh,rh);
    }
}