/*You are required to complete the function*/
class Solution {
    public int findMaxProduct(int[] arr, int k) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int prod=1;
            for(int j=i;j<(i+k);j++){
                prod*=arr[j];
            }
            max=Math.max(max, prod);
        }
        return max;
    }
}