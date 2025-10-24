// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                continue;
            } else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}