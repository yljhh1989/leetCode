package com.ylj;

public class Leetcode011 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int result = 0;
        while (left <right){
            int min = Math.min(height[left], height[right]);
            int curr =(right-left)*min;
            if(curr >result){
                result = curr;
            }
            if(height[left] <height[right]){
                left ++;
            }else {
                right --;
            }
        }
        return result;
    }

}
