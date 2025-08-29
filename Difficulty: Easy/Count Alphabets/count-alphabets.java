// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        int count=0;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z'){
                count++;
            }
        }
        return count;
    }
}