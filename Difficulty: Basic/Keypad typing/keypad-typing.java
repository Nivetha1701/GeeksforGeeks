// User function Template for Java
class Solution {
    // Function to find matching decimal representation of a string as on the keypad.
    public static String printNumber(String s, int n) {
        // Your code here
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c<='c') str.append('2');
            else if(c<='f') str.append('3');
            else if(c<='i') str.append('4');
            else if(c<='l') str.append('5');
            else if(c<='o') str.append('6');
            else if(c<='s') str.append('7');
            else if(c<='v') str.append('8');
            else str.append('9');
        }
        return str.toString();
    }
}