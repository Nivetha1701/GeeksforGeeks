// User function Template for Java
class Solution {
    static ArrayList<Integer> getXor(ArrayList<Integer> A, int N) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int xor=0;
        for(int i=0;i<N;i++){
            xor^=A.get(i);
        }
        for(int num:A){
            al.add(xor^num);
        }
        return al;
    }
}