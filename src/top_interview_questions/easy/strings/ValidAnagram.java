package top_interview_questions.easy.strings;

import java.util.Arrays;

public class ValidAnagram {

    /*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:

    Input: s = "rat", t = "car"
    Output: false*/

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

        String s1 = "rat";
        String t1 = "car";
        System.out.println(isAnagram(s1, t1));
    }
}
