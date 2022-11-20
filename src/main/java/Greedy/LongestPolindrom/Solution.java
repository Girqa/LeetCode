package Greedy.LongestPolindrom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("abccccdd"));
        System.out.println(s.SetLongestPalindrome("abccccdd"));
    }

    public int SetLongestPalindrome(String s){
        Set<Character> set = new HashSet<>();
        int len = 0;

        for (char ch: s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                len += 2;
            } else {
                set.add(ch);
            }
        }
        return set.size() > 0 ? len + 1 : len;
    }

    public int longestPalindrome(String s) {
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        char curCh = letters[0];
        int counter = 0;
        int pairs = 0;

        for (char ch: letters) {
            if (curCh == ch) {
                counter += 1;
                if (counter % 2 == 0) {
                    pairs++;
                    counter = 0;
                }
            } else {
                curCh = ch;
                counter = 1;
            }
        }
        return letters.length > pairs*2 ? pairs*2 + 1 : pairs*2;
    }
}
