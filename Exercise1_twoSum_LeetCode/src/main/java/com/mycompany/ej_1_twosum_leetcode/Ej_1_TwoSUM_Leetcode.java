package com.mycompany.ej_1_twosum_leetcode;
import java.util.Arrays; //Biblioteca para poder imprimir los valores del array
/**
 *
 * @author franklin
 */
public class Ej_1_TwoSUM_Leetcode {

    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
       System.out.println(Arrays.toString(twoSum(nums,target)));
    };
     public static int[] twoSum(int[] nums, int target) {
         
         int[] arr = new int[2];
         
         for (int i = 0; i < nums.length; i++) {
             for (int j = (i+1); j < nums.length; j++){//Comparación con fuerza bruta
                 if(nums[i] + nums[j] == target){
                      arr[0] = i;
                      arr[1] = j;
                      return arr;//retorna el array en caso cumpla los requisitos
                 }
             }
         }
         return null;//retorna null en caso no cumpla los requisitos
    }
};
