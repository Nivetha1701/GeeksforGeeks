// User function Template for Java

// User function Template for Java

class Solution {
    public int minimumApple(int[] arr) {
        // Complete the function
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
