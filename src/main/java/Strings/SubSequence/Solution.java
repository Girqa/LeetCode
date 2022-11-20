package Strings.SubSequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        int index = 0;
        int size = s.length()-1;
        for (char ch: t.toCharArray()) {
            if (ch == chars[index]) {
                index++;
                if (size == index) {
                    return true;
                }
            }
        }
        return false;
    }
}