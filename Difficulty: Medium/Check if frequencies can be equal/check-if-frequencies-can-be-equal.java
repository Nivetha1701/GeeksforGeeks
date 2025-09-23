import java.util.*;

class Solution {
    public boolean sameFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // collect non-zero frequencies
        List<Integer> list = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) list.add(f);
        }

        Collections.sort(list);

        int n = list.size();
        
        // Case 1: all equal
        if (list.get(0).equals(list.get(n-1))) return true;

        // Case 2: first is 1 and others are equal
        if (list.get(0) == 1 && list.get(1).equals(list.get(n-1))) return true;

        // Case 3: all same except last one which is bigger by 1
        if (list.get(0).equals(list.get(n-2)) && list.get(n-1) == list.get(0) + 1) return true;

        return false;
    }
}
