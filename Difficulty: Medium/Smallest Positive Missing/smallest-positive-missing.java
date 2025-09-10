class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int small=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]==small){
                small++;
            } 
        }
        return small;
    }
}
