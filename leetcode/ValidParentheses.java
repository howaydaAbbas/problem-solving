package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        if (s.length() <= 1 || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                characterStack.push(')');
            } else if (c == '{') {
                characterStack.push('}');
            } else if (c == '[') {
                characterStack.push(']');
            } else {
                if (characterStack.isEmpty() || characterStack.pop() != c) {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
