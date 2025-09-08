// User function Template for Java

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int odd=0,even=0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                odd+=Arr[i];
            } else{
                even+=Arr[i];
            }
        }
        al.add(odd);
        al.add(even);
        return al;
    }
}