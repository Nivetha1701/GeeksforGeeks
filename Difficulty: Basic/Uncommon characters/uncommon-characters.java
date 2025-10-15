// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        TreeSet<Character> set=new TreeSet<>();
        for(int i=0;i<s1.length();i++){
            if(s2.indexOf(s1.charAt(i))==-1){
                set.add(s1.charAt(i));
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))==-1){
                set.add(s2.charAt(i));
            }
        }
        String res="";
        for(char c:set){
            res+=c;
        }
        return res;
    }
}