// User function Template for Java
import java.math.*;
class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        BigInteger b1=new BigInteger(s1,2);
        BigInteger b2=new BigInteger(s2,2);
        return b1.add(b2).toString(2);
    }
}