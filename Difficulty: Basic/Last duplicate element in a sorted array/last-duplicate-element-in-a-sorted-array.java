// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int index=-1, num=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                index=i;
                num=arr[i];
            }
        }
        return new int[]{index, num};
    }
}
