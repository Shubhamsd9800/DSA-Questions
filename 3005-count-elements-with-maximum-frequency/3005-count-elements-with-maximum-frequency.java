class Solution {
    public int maxFrequencyElements(int[] nums) {
          int maxFreq=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
          }
          else{
            map.put(nums[i],1);
          }
          if(map.containsKey(nums[i]) && map.get(nums[i])>maxFreq){
            maxFreq=map.get(nums[i]);
          }
        }

        int cnt=0;
        List<Integer> list= new ArrayList<>(map.values());
        for(int num : list){
          if(num==maxFreq){
            cnt += num;
          }
        }

        return cnt;

    }
}