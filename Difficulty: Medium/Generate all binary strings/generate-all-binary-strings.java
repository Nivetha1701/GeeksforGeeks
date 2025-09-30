class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        int total=1<<n;
        for(int i=0;i<total;i++){
            String s=Integer.toBinaryString(i);
            while(s.length()<n) {
                s="0"+s;
            }
            res.add(s);
        }
        return res;
    }
}
