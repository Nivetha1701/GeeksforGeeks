
class Solution {
    public String longest(List<String> arr) {
        // code here
        String max="";
        for(int i=0;i<arr.size();i++){
            int len=arr.get(i).length();
            if(len>max.length()){
                max=arr.get(i);
            }
        }
        return max;
    }
}
