// User function Template for Java
class Solution {
    char firstRep(String S) {
        // your code here
        for(int i=0;i<S.length();i++){
            char c[]=S.toCharArray();
            for(int j=i+1;j<S.length();j++){
                if(c[i]==c[j]){
                    return c[i];
                }
            }
        }
        return '#';
    }
}