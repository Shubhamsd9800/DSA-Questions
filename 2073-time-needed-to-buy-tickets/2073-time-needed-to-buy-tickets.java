class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n= tickets.length;
        int val=tickets[k];
        int t=0;
        for(int i=0;i<n;i++){
          if(i<k){
            t=t+Math.min(tickets[i],val);
          }
          else if(i==k){
            t=t+val;
          }
          else{
            if(tickets[i]<val){
              t=t+tickets[i];
            }
            else{
              t=t+val-1;
            }
          }
        }

        return t;
    }
}