class Solution {
    public static boolean checkPangram(String s) {
        // code here
        s=s.toLowerCase();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                set.add(s.charAt(i));
            }
        }
        return set.size()==26;
    }
}