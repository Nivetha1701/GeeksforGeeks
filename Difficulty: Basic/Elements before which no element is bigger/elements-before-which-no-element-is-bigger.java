class Solution {
    public int countElements(int[] arr) {
        // code here
        int count=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        return count;
    }
}
