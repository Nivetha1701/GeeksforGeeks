// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            } else{
                neg.add(arr[i]);
            }
        }
        int index=0;
        for(int num:pos){
            arr[index++]=num;
        }
        for(int num:neg){
            arr[index++]=num;
        }
    }
}