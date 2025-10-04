// User function Template for Java
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(i==key){
                return arr[i];
            }
        }
        return -1;
    }
}