class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n=arr.length;
        HashMap<Integer, Integer> freq=new HashMap<>();
        int l=n/k;
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int val: freq.values()){
            if(val>l) count++;
        }
        return count;
    }
}