class Solution {

    public static void permute(int[] ip,List<Integer> tempList, List<List<Integer>> ans){

      if(tempList.size()==ip.length){
        ans.add(new ArrayList<>(tempList));
        return;
      }
      for(int i=0;i<ip.length;i++){
        if(!tempList.contains(ip[i])){
          tempList.add(ip[i]);
          permute(ip,tempList,ans);
          tempList.remove(tempList.size()-1);
        }
      }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        permute(nums,new ArrayList<>(),ans);
        return ans;
    }
}