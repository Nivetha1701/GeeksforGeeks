// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        String s=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}