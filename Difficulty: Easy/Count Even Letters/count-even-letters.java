class Solution {
    public int count(String s) {
        // code here
        int freq[]=new int[1001];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int count=0;
        boolean seen[]=new boolean[freq.length];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]%2==0 && seen[c]==false){
                count++;
                seen[c]=true;
            }
        }
        return count;
    }
}