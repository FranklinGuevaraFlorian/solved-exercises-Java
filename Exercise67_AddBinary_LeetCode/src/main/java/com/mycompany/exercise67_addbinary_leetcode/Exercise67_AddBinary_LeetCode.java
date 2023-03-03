package com.mycompany.exercise67_addbinary_leetcode;
/**
 *
 * @author franklin
 */
public class Exercise67_AddBinary_LeetCode {

    public static void main(String[] args) {
       
        System.out.println(addBinary("1010","1011"));//invoking the method for binary addition
    };
     public static String addBinary(String a, String b) {//Combine both methods
         
         int aInteger = toDecimal(a);
         int bInteger = toDecimal(b);
         
         int decimalSum = aInteger + bInteger; 
         
         if(decimalSum > 0) return toBinary(decimalSum);
         
         return "0";
    };
     public static int toDecimal(String a){ //Convert binary numbers to decimal
         char[] aChar = a.toCharArray();
         int decimalNumber = 0;
         int exponent = 0;
         for (int i = aChar.length - 1; i >= 0; i--) {
             if(aChar[i] == '1') decimalNumber += Math.pow(2, exponent);
             exponent++;
         }
      return decimalNumber;  
     };
     public static String toBinary(int b){//Convert decimal sum to binary
         double quotient = b;
         String cociente = "";
         while(quotient >= 1){
             cociente +=  (int)(quotient % 2);
             quotient = (int)(quotient/2);
         }
         return reverse(cociente);
     };
     public static String reverse(String result){//returns the value of the String in the correct order
         char[] resultChar = result.toCharArray();
         result = "";
         for (int i = resultChar.length - 1; i >= 0; i--) {
             result += resultChar[i];
         }
         return result; //returns the final value in a string
     };
    
};
