package com.mycompany.ej_1_twosum_leetcode;
import java.util.Arrays; //Library to be able to print the values ​​of the array
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
             for (int j = (i+1); j < nums.length; j++){// Comparison with brute force
                 if(nums[i] + nums[j] == target){
                      arr[0] = i;
                      arr[1] = j;
                      return arr;//returns the array if it meets the requirements
                 }
             }
         }
         return null;//returns null if it does not meet the requirements
    }
};
