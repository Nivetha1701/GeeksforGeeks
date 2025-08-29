// User function Template for Java
class Solution {
    public long factorSum(int N) {
        // code here.
        long sum=0;
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
                sum+=i;
                if(i!=N/i){
                    sum+=N/i;
                }
            }
        }
        return sum;
    }
}