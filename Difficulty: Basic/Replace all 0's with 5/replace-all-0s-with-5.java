class Solution {
    int convertfive(int num) {
        // Your code here
        String str=String.valueOf(num);
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                s+='5';
            } else{
                s+=str.charAt(i);
            }
        }
        return Integer.parseInt(s);
    }
}