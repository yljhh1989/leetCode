package com.ylj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode018 {

    public static void main(String[] args) {

        System.out.println(fourSum(new int[]{2,2,2,2},8));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if(nums[0] > 0 && target < 0){
            return result;
        }
        for(int k = 0;k<nums.length-3;k++){
            if(k>0 && nums[k] == nums[k-1]) continue;
            for(int m = k+1;m<nums.length -2;m++){
                if(m>k+1 && nums[m] == nums[m-1]) continue;
                int i = m +1,j = nums.length-1;
                while (j>i){
                    int sum = nums[k]+nums[m]+nums[i]+nums[j];
                    if(sum == target){
                        List<Integer> item = new ArrayList<>();
                        item.add(nums[k]);
                        item.add(nums[m]);
                        item.add(nums[i]);
                        item.add(nums[j]);
                        result.add(item);
                        i++;
                        while (j>i && nums[i] == nums[i-1])
                            i++;
                        j--;
                        while (j>i && nums[j] == nums[j+1])
                            j--;
                    } else if (sum > target){
                        j--;
                        while (j>i && nums[j] == nums[j+1])
                            j--;
                    } else{
                        i++;
                        while (j>i && nums[i] == nums[i-1])
                            i++;
                    }
                }
            }
        }
        return result;
    }
}
