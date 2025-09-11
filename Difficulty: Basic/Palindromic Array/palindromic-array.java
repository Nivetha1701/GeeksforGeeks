/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            if(!isPalindrome(String.valueOf(arr[i]))){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String num){
        StringBuilder str=new StringBuilder(num);
        String s=str.reverse().toString();
        return s.equals(num);
    }
}