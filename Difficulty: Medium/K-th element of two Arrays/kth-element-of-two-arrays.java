class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int ans[]=new int[a.length+b.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            ans[index++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            ans[index++]=b[i];
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}