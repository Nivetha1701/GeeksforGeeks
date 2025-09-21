// User function Template for Java

class Solution {

    ArrayList<Integer> printNumHavingAltBitPatrn(int n) {
        // Code Here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(isAlternating(i)){
                al.add(i);
            }
        }
        return al;
    }
    public static boolean isAlternating(int num){
        String s=Integer.toBinaryString(num);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
