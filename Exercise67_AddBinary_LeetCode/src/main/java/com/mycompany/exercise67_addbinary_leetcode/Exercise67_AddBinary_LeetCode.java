package com.mycompany.exercise67_addbinary_leetcode;
/**
 *
 * @author franklin
 */
public class Exercise67_AddBinary_LeetCode {

    public static void main(String[] args) {
         String cociente = "";
         double div = 5;
         
         for (int i = 0; div >= 1; i++) {
             div = Math.floor(div/2);
             cociente += div % 2; 
         }
        System.out.println(div);
    };
     public static String addBinary(String a, String b) {
     
         int aInteger = toDecimal(a);
         int bInteger = toDecimal(b);
         
         int decimalSum = aInteger + bInteger;
         
        return "";
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
         String cociente = "";
         double div = b;
         
         while(div >= 1){
             
             div = Math.floor(div/2)
         }
         
         return " ";
     };
    
};
