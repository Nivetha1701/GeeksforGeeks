// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        int flag=0;
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(set.contains(c[i])){
                str.append(c[i]);
                flag=1;
                break;
            }
            set.add(c[i]);
        }
        if(flag==0) return "-1";
        else
        return str.toString();
    }
}