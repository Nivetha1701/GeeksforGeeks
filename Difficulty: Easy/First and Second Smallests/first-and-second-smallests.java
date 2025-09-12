class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> al=new ArrayList<>();
        if(set.size()<2){
            al.add(-1);
        }
        else{
            Iterator<Integer> it=set.iterator();
            al.add(it.next());
            al.add(it.next());
        }
        return al;
    }
}
