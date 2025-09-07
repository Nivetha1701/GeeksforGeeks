// User function Template for Java
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        return new Pair<>(min,max);
    }
}
