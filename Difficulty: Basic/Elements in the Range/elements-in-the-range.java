// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();   
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int num:set){
            if(num>=A && num<=B){
                count++;
            }
        }
        int diff=B-A;
        if(count == diff+1) return true;
        return false;
    }
}
