// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        long ans[]=new long[arr.length-2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
}