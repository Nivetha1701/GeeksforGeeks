import java.math.*;
class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        BigInteger n1=new BigInteger(s1);
        BigInteger n2=new BigInteger(s2);
        return n1.multiply(n2).toString();
    }
}