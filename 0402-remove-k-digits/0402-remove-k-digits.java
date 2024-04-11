class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> numSt= new Stack<>();
        for(char digit : num.toCharArray()){
            while(k>0 && !numSt.isEmpty() && digit<numSt.peek()){
                numSt.pop();
                k--;
            }
            numSt.push(digit);
        }
        while(k>0 && !numSt.isEmpty()){
            numSt.pop();
            k--;
        }

        StringBuilder temp= new StringBuilder();
        while(!numSt.isEmpty()){
            temp.append(numSt.pop());
        }

        temp.reverse();


        int m= temp.length();
        StringBuilder res= new StringBuilder();
        int fdNonZero=0;
        for(int i=0;i<m;i++){
            if(temp.charAt(i) == '0' && fdNonZero ==0){
                continue;
            }
            else{
                res.append(temp.charAt(i));
                fdNonZero=1;
            }
        }

        if(res.length()==0){
            res.append('0');
        }

        return res.toString();
    }
}