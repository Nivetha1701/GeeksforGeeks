// User function Template for Java
class Solution {
    static int xorGate(int arr[], int N) {
        // code here
        int ans=arr[0];
        for(int i=1;i<N;i++){
            ans=arr[i]^ans;
        }
        return ans;
    }
};