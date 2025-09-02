class Solution {
    public void concat(String s1, String s2) {
        if (s1 == null) s1 = "";
        if (s2 == null) s2 = "";
        s1 = s1.replaceFirst("\\s+$", "");   // remove trailing spaces only
        System.out.println(s1 + s2);
    }
}
