// User function Template for Java

class Complete {

    public static String Sandwiched_Vowel(String str) {
        // Complete function
        StringBuilder s=new StringBuilder();
        s.append(str.charAt(0));
        for(int i=1;i<str.length()-1;i++){
            if(!isVowel(str.charAt(i-1)) && !isVowel(str.charAt(i+1)) 
            && isVowel(str.charAt(i))){
                continue;
            } else{
                s.append(str.charAt(i));
            }
        }
        s.append(str.charAt(str.length()-1));
        return s.toString();
    }
    
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}
