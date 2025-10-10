class Solution {
    // Function to get the count of elements between num1 and num2 in array arr.
    public int getCount(ArrayList<Integer> arr, int num1, int num2) {
        // Your Code goes here.
        int count=0;
        int index1=-1,index2=-1;
        for(int i=0;i<arr.size();i++){
            int num=arr.get(i);
            if(num==num1 && index1==-1) index1=i;
            if(num==num2) index2=i;
        }
        if(index1 == -1 || index2 == -1 || index1>=index2) return 0;
        return (index2-index1)-1;
    }
}