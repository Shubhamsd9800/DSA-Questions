class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st= new Stack<>();
        for(char c:s.toCharArray()){
            Queue<Character> q= new LinkedList<>();
            if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    q.add(st.pop());
                }
                if(!st.isEmpty()) st.pop();
                while(!q.isEmpty()) st.push(q.remove());
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        return sb.reverse().toString();
    }
}