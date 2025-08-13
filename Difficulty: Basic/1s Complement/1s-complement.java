// User function Template for Java
class Solution {
    static String onesComplement(String S, int N) {
        // code here
        char arr[]=S.toCharArray();
        for(int i=0;i<N;i++){
            arr[i]=(arr[i]=='0') ? '1' : '0';
        }
        return new String(arr);
    }
}