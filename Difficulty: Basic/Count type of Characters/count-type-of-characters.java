// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int upper=0, lower=0, num=0, special=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                lower++;
            } else if(c>='A' && c<='Z'){
                upper++;
            } else if(c>='0' && c<='9'){
                num++;
            } else{
                special++;
            }
        }
        return new int[]{upper, lower, num, special};
    }
}