import java.util.*;
class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int count[]=new int[10001];
        char c[]=s.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<s.length();i++){
            count[c[i]]++;
        }
        int max=Integer.MIN_VALUE;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(max<count[c[i]]){
                max=count[c[i]];
                ch=c[i];
            }
        }
        return ch;
    }
}