package com.ylj;

import java.util.Arrays;

public class Leetcode016 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = 0;
        int x = Integer.MAX_VALUE;
        for(int k = 0;k<nums.length-2;k++){
           int  i=k+1,j=nums.length -1;
          while (j >i){
              int sum = nums[k] + nums[i] + nums[j];
              if(sum > target){
                  if (sum -target <x){
                      x= sum -target;
                      result = sum;
                  }
                  j--;
              } else  if(sum < target) {
                  if (target -sum <x){
                      x= target - sum;
                      result = sum;
                  }
                  i++;
              } else {
                  return target;
              }
          }
        }

        return result;
    }
}
