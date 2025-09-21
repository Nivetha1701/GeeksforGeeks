// User function Template for Java
class Solution {
    static long bitsAreInAltOrder(long n) {
        // code here
        String s=Long.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return 0;
            }
        }
        return 1;
    }
}