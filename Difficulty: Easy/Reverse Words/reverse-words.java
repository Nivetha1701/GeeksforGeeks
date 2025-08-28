class Solution {
    public String reverseWords(String s) {
        // Code here
        ArrayList<String> words=new ArrayList<>();
        String str[]=s.split("\\.");
        for(String w:str){
            if(!w.isEmpty()){
                words.add(w);
            }
        }
        Collections.reverse(words);
        return String.join(".", words);
    }
}
