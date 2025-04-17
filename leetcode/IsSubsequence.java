package leetcode;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

       /* int lastIndex = -1;
        int occurrance = 0;
        if (s.length() > t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = lastIndex+1; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (j > lastIndex) {
                        lastIndex = j;
                        occurrance++;
                        break;
                    } else {
                        return false;
                    }
                }
            }
        }
        return occurrance >= s.length(); */

        // better complexity
        if (s.isEmpty()) return true;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
