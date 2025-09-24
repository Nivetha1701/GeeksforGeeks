class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    break;
                }
            }
            if(min==arr[i]){
                al.add(-1);
            } else{
                al.add(min);
            }
        }
        al.add(-1);
        return al;
    }
}