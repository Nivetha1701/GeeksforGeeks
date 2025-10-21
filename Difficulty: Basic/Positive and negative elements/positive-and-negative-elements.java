// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                pos.add(arr.get(i));
            }
            if(arr.get(i)<0){
                neg.add(arr.get(i));
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<pos.size();i++){
            al.add(pos.get(i));
            al.add(neg.get(i));
        }
        return al;
    }
}
