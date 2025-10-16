// User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        String res="";
        String str[]=S.split(" ");
        for(int i=0;i<str.length;i++){
            res+=str[i].charAt(0);
        }
        return res;
    }
};