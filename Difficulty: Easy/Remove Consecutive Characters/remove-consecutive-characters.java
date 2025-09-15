// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        char c[]=s.toCharArray();
        sb.append(c[0]);
        for(int i=1;i<s.length();i++){
            if(c[i]==c[i-1]){
                continue;
            } else{
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}