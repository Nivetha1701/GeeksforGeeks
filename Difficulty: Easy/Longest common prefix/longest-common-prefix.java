// User function Template for Java

class Solution {
    public int longestCommonPrefix(String str1, String str2) {
        int n = str1.length();
        
        for (int len = n; len > 0; len--) {
            String prefix = str1.substring(0, len);
            if (str2.contains(prefix)) {
                return len;
            }
        }
        return 0;
    }
}
