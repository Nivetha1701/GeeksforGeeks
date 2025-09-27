class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        int max=-1;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            int a=arr[i], b=arr[i-1], c=arr[i-2];
            int peri=-1;
            if(b+c > a){
                peri=a+b+c;
            }
            max=Math.max(max, peri);
        }
        return max;
    }
}