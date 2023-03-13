package com.mycompany.exercise9_palindromenumber_leetcode;
/**
 *
 * @author franklin
 */
public class Exercise9_PalindromeNumber_LeetCode {

    public static void main(String[] args) {
        System.out.println(isPalindrome(192));
        System.out.println(isPalindrome(191));
    };
    public static boolean isPalindrome(int number){ 
         String numberString = String.valueOf(number);
         String definitiveNumber = "";
         char[] arrOfNumberString = numberString.toCharArray();
         
         if(number > 0){
             for (int i = arrOfNumberString.length - 1; i >= 0; i--)  definitiveNumber += arrOfNumberString[i];
             if(definitiveNumber.equals(numberString)) return true;
         }
        return false;
    };
    
}
