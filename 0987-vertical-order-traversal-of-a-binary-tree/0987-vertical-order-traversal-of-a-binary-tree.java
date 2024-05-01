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
 class tuple{
  TreeNode node;
  int ver;
  int lev;
  public tuple(TreeNode _node, int _ver, int _lev){
    node= _node;
    ver=_ver;
    lev=_lev;
  
  }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<tuple> q= new LinkedList<tuple>();
        q.add(new tuple(root,0,0));
        while(!q.isEmpty()){
          tuple tp=q.remove();
          TreeNode node= tp.node;
          int ver=tp.ver;
          int lev=tp.lev;
          if(!map.containsKey(ver)){
            map.put(ver,new TreeMap<>());
          }
          if(!map.get(ver).containsKey(lev)){
            map.get(ver).put(lev,new PriorityQueue<>());
          }
          map.get(ver).get(lev).offer(node.val);
          if(node.left!=null){
            q.add(new tuple(node.left,ver-1,lev+1));
          }
          if(node.right!=null){
            q.add(new tuple(node.right,ver+1,lev+1));
          }
        }

        List<List<Integer>> list= new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
          list.add(new ArrayList<>());
          for(PriorityQueue<Integer> nodes: ys.values()){
              while(!nodes.isEmpty()){
                list.get(list.size()-1).add(nodes.remove());
              }
          }
        }

        return list;
    }
}