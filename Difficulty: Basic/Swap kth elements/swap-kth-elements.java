
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int num1=k-1;
        int num2=arr.size()-k;
        int temp=arr.get(num1);
        arr.set(num1,arr.get(num2));
        arr.set(num2,temp);
    }
}
