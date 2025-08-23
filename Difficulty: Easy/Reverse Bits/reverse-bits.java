// User function Template for Java

class Solution {
    public int reverseBits(int n) {
        // code here
        String bin = Integer.toString(n, 2);   // convert to binary string
        String rev = new StringBuilder(bin).reverse().toString();
        return Integer.valueOf(rev, 2); 
    }
}