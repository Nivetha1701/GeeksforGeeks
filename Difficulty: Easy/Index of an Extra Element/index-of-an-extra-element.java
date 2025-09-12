/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
                return i;
            }
        }
        return a.length-1;
    }
}