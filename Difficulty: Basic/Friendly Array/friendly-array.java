class Solution {
    public int calculateFriendliness(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=Math.abs(arr[i]-arr[i+1]);
        }
        sum+=Math.abs(arr[arr.length-1]-arr[0]);
        return sum;
    }
}
