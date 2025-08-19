

class Solution {
    static final long MOD = 1_000_000_007L;

    static long prodTwoDigit(long N) {
        String s = String.valueOf(N);
        if ((s.length() & 1) == 1) s = "0" + s; // make length even

        long prod = 1;
        for (int i = 0; i < s.length(); i += 2) {
            int val = Integer.parseInt(s.substring(i, i + 2));
            prod = (prod * val) % MOD;
        }
        return prod;
    }
}
