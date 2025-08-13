// User function Template for Java

class Solution {
    public int maxXor(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int xor=arr[i]^arr[j];
                max=Math.max(max,xor);
            }
        }
        return max;
    }
}