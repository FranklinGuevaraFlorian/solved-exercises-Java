package com.mycompany.exercise58_lengthoflastword_leetcode;
/**
 *
 * @author franklin
 */
public class Exercise58_LengthOfLastWord_LeetCode {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moonn  "));
    };
    public static int lengthOfLastWord(String s) {
        char[] sChar = s.toCharArray();
        String word = "";
        for (int i = sChar.length - 1; i >= 0; i--) {
            if(sChar[i] != ' '){
                word += sChar[i];
                if(i !=0  && sChar[i-1] == ' ' )  break;
            }
        }
        return word.length();
    };
};
