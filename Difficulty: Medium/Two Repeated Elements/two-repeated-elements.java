class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int ans[]=new int[2];
        int index=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                ans[index++]=arr[i];
            }
            set.add(arr[i]);
        }
        return ans;
    }
}