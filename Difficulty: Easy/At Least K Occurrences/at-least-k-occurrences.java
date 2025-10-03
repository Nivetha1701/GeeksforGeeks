class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        int count[]=new int[10001];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            if(count[arr[i]]>=k){
                return arr[i];
            }
        }
        return -1;
    }
}