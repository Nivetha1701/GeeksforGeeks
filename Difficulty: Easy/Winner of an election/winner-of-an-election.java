// User function Template for Java

class Solution {
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        // add your code
        Arrays.sort(arr);
        String winner=arr[0];
        int max=1, curr=1;
        for(int i=1;i<n;i++){
            if(arr[i].equals(arr[i-1])){
                curr++;
            }
            else{
                curr=1;
            }
            if(curr>max){
                max=curr;
                winner=arr[i];
            }
        }
        return new String[]{winner, String.valueOf(max)};
    }
}
