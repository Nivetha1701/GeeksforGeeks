// User function Template for Java
class Solution {
    static long divSum(long n) {
        // code here
        long count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count+=i;
            }
        }
        return count;
    }
}