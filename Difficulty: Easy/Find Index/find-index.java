// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int first=-1, last=-1;
        int f1=0, f2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key && f1==0){
                first=i;
                f1=1;
            }
            if(arr[arr.length-i-1]==key && f2==0){
                last=arr.length-i-1;
                f2=1;
            }
        }
        return new int[]{first, last};
    }
}