class Solution {
    public String toggleCase(String s) {
        // code here
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                res+=Character.toLowerCase(c);
            } else{
                res+=Character.toUpperCase(c);
            }
        }
        return res;
    }
}
