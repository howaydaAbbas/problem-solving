package leetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();
        int lastCharIndex = s.length()-1;
            for(int i = 0; i < s.length()/2 ; i++){
                if(s.charAt(i) != s.charAt(lastCharIndex))
                    return false;
                lastCharIndex--;
            }
        return true;
    }
}
