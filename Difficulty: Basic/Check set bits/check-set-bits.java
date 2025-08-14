// User function Template for Java
class Solution {
    static int isBitSet(int N) {
        // code here
        String s=Integer.toBinaryString(N);
        int count=Integer.bitCount(N);
        int n=s.length();
        if(n==count){
            return 1;
        }
        return 0;
    }
}