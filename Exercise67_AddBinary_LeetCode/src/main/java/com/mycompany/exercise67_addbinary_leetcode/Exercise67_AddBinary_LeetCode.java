package com.mycompany.exercise67_addbinary_leetcode;
/**
 *
 * @author franklin
 */
public class Exercise67_AddBinary_LeetCode {

    public static void main(String[] args) {
        
        System.out.println(addBinary("101","11"));
    };
     public static String addBinary(String a, String b) {
     
         int aInteger = toDecimal(a);
         int bInteger = toDecimal(b);
         
         int decimalSum = aInteger + bInteger;

        return toBinary(decimalSum);
    };
     public static int toDecimal(String a){
         char[] aChar = a.toCharArray();
         int decimalNumber = 0;
         int exponent = 0;
         for (int i = aChar.length - 1; i >= 0; i--) {
             if(aChar[i] == '1') decimalNumber += Math.pow(2, exponent);
             exponent++;
         }
      return decimalNumber;  
     };
     public static String toBinary(int b){
         double div = b;
         String cociente = "";
         while(div >= 1){
             cociente +=  (int)(div%2);
             div = (int)(div/2);
         }
         return reverse(cociente);
     };
     public static String reverse(String result){
         char[] resultChar = result.toCharArray();
         result = "";
         for (int i = resultChar.length - 1; i >= 0; i--) {
             result += resultChar[i];
         }
         return result;
     };
    
};
