// User function Template for Java

class Solution {
    static int findPosition(int n) {
        // code here
        int count=Integer.bitCount(n);
        if(count!=1){
            return -1;
        }
        return Integer.numberOfTrailingZeros(n)+1;
    }
};