// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        ArrayList<Integer> al=new ArrayList<>();
        int index=0;
        int arr1[]=new int[arr.length/2];
        int arr2[]=new int[arr.length/2];
        for(int i=0;i<arr.length/2;i++){
            arr1[index++]=arr[i];
        }
        Arrays.sort(arr1);
        index=0;
        for(int i=arr.length/2;i<arr.length;i++){
            arr2[index++]=arr[i];
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            al.add(arr1[i]);
        }
        for(int i=arr2.length-1;i>=0;i--){
            al.add(arr2[i]);
        }
        return al;
    }
}