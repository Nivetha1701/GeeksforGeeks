class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        al.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                al.add(arr[i]);
            }
        }
        Collections.reverse(al);
        return al;
    }
}
