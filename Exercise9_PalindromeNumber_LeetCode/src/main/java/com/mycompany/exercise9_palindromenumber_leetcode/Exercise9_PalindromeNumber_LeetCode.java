package com.mycompany.exercise9_palindromenumber_leetcode;
/**
 *
 * @author franklin
 */
public class Exercise9_PalindromeNumber_LeetCode {

    public static void main(String[] args) {
        System.out.println(isPalindrome(192));// return value false
        System.out.println(isPalindrome(191));// return value true
    };
    public static boolean isPalindrome(int number){ 
         String numberString = String.valueOf(number);
         String definitiveNumber = "";
         char[] arrOfNumberString = numberString.toCharArray();
         
         if(number > 0){ // check if it is greater than 0 to perform the comparison
             for (int i = arrOfNumberString.length - 1; i >= 0; i--)  definitiveNumber += arrOfNumberString[i];
             if(definitiveNumber.equals(numberString)) return true;
         }
        return false; //returns false if the number is less than 0 or is not a palindrome
    };
    
}
