class Solution {

    public void recurse(List<String> ans, int oc,int cc,int n, String s ){
      if(oc==n && cc==n){
        ans.add(s);
        return;
      }
      if(oc<n){
        recurse(ans,oc+1,cc,n,s+"(");
      }
      if(cc<oc){
        recurse(ans,oc,cc+1,n,s+")");
      }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<String>();
        int oc=0,cc=0;
        recurse(ans,oc,cc,n,"");
        return ans;
    }
}