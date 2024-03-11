class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> mp= new HashMap<>();
        StringBuilder str= new StringBuilder();
        for(char c: s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c: order.toCharArray()){
            if(mp.containsKey(c)){
                int freq=mp.get(c);
                while(freq-->0){
                    str.append(c);
                }
                mp.put(c,0);
            }
        }

        for(char c: s.toCharArray()){
            if(mp.get(c)!=0){
                str.append(c);
                mp.put(c,mp.get(c)-1);
            }
        }

        return str.toString();
    }
}