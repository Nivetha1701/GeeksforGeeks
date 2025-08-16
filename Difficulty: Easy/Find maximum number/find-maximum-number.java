// User function Template for Java

class Solution {
    static String findMax(String N) {
        // code here
        char arr[]=N.toCharArray();
        Arrays.sort(arr);
        String s="";
        for(int i=arr.length-1;i>=0;i--){
            s+=arr[i];
        }
        return s;
    }
};