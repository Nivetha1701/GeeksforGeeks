class Solution {
    public String reverse(String S) {
        // code here
        char ch[]=S.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<ch.length;i++){
            st.push(ch[i]);
        }
        String rev="";
        for(int i=0;i<ch.length;i++){
            rev+=st.pop();
        }
        return rev;
    }
}