// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int f1=0,f2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                al.add(i);
                f1=1;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                al.add(i);
                f2=1;
                break;
            }
        }
        if(f1!=0 && f2!=0){
            return al;
        }
        else {
            al.add(-1);
            al.add(-1);
        }
        return al;
    }
}
