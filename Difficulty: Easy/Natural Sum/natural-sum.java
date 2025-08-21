// User function Template for Java

class Solution {
    public int find(int n) {
        // code here
        int count=0,sum=0;
        if(n==1) return 1;
        for(int i=1;i<n;i++){
            sum+=i;
            count++;
            if(sum==n){
                break;
            }
        }
        if(sum==n){
        return count;
        }
        return -1;
    }
}