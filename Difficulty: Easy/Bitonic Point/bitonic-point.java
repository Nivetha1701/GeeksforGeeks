// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}